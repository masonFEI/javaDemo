/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import java.util.Base64;

/**
 * URLDecodeDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-01-08 10:50
 */
public class URLDecodeDemo {


    public static void main(String[] args) {
        String encodedString = "bcPA/+2pakebATV3ih06ZA==";
        try {

            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            System.out.println(new String(decodedBytes));


        } catch (Exception e) {
            // 处理不支持的编码异常
            e.printStackTrace();
        }
    }


}