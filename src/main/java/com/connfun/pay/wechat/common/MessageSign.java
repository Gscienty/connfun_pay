package com.connfun.pay.wechat.common;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class MessageSign {
    private final static String[] HEX_DIGIT = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F"
    };

    public static String sign(String msg, SignType signType)
        throws UnsupportedOperationException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {

        if (signType.equals(SignType.MD5)) {
            MessageDigest md = MessageDigest.getInstance(signType.toString());
            return MessageSign.bytesToHexString(md.digest(msg.getBytes()));
        }
        else if (signType.equals(SignType.HMACSHA256)) {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec sks  = new SecretKeySpec(Configure.KEY.getBytes("utf-8"), "HmacSHA256");

            mac.init(sks);

            return MessageSign.bytesToHexString(mac.doFinal(msg.getBytes()));
        }
        else {
            throw new NoSuchAlgorithmException();
        }
    }

    public static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(byteToHexString(b));
        }

        return sb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b < 0 ? 256 + b : b;
        return HEX_DIGIT[n / 16] + HEX_DIGIT[n % 16];
    }
}

