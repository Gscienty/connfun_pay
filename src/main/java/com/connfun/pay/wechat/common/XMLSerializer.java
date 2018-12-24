package com.connfun.pay.wechat.common;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.connfun.pay.common.EntityName;
import com.connfun.pay.wechat.entity.BaseEntity;
import com.connfun.pay.wechat.entity.BaseResponseEntity;

public class XMLSerializer {
    public static String serialize(BaseEntity obj) {
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");

        Method[] getMethods = obj.getClass().getMethods();
        for (Method getMethod : getMethods) {
            if (!getMethod.getName().startsWith("get")) {
                continue;
            }
            EntityName fieldName = getMethod.getAnnotation(EntityName.class);
            if (fieldName == null) {
                continue;
            }

            try {
                Object originValue = getMethod.invoke(obj);
                if (originValue == null) {
                    continue;
                }
                String value = originValue.toString();
                if (value == null) {
                    continue;
                }

                sb.append("<");
                sb.append(fieldName.value());
                sb.append(">");

                if (value.contains("[")) {
                    sb.append("<![CDATA[");
                    sb.append(value);
                    sb.append("]]>");
                }
                else {
                    sb.append(value);
                }

                sb.append("</");
                sb.append(fieldName.value());
                sb.append(">");

            }
            catch (IllegalAccessException e) {
                continue;
            }
            catch (InvocationTargetException e) {
                continue;
            }
        }

        sb.append("</xml>");
        return sb.toString();
    }

    private static Document parseXML(String msg)
        throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        StringReader sr = new StringReader(msg);
        InputSource is = new InputSource(sr);
        return builder.parse(is);
    }

    @SuppressWarnings("unchecked")
    public static <T extends BaseResponseEntity> T deserialize(String msg, Class<T> clazz) 
        throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ParserConfigurationException, SAXException, IOException {
        Map<String, Method> setters = new TreeMap<String, Method>();
        for (Method setMethod : clazz.getMethods()) {
            if (!setMethod.getName().startsWith("set")) {
                continue;
            }

            EntityName name = setMethod.getAnnotation(EntityName.class);
            if (name == null) {
                continue;
            }

            setters.put(name.value(), setMethod);
        }

        Object obj = clazz.getConstructor().newInstance();

        Document doc = XMLSerializer.parseXML(msg);
        Element rootElement = doc.getDocumentElement();
        NodeList fields = rootElement.getChildNodes();
        for (int i = 0; i < fields.getLength(); i++) {
            Node node = fields.item(i);
            String name = node.getNodeName();

            if (setters.containsKey(name)) {
                String value = node.getTextContent();
                setters.get(name).invoke(obj, value);
            }
        }

        return (T) obj;
    }
}

