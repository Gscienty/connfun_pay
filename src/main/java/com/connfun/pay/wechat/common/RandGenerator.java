package com.connfun.pay.wechat.common;

import java.util.Random;

public class RandGenerator {
    private final static String ALPHA = "abcdefghijklmnopqrstuvwxyz0123456789";

    public static String get(int length) {
        Random rand = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            sb.append(ALPHA.charAt(rand.nextInt(ALPHA.length())));
        }

        return sb.toString();
    }
}

