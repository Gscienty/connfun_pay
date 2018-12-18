package com.connfun.pay.wechat.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.connfun.pay.wechat.common.EntityName;
import com.connfun.pay.wechat.entity.BaseEntity;

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
                String value = getMethod.invoke(obj).toString();
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
}

