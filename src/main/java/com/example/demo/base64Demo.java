/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

/**
 * base64Demo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-10-30 10:36
 */
@NoArgsConstructor
@Data
public class base64Demo {


    public static byte[] dst;
    public static int DIGEST_LENGTH = 1 << 4;
    public static byte[] digestTarget;
    public static int DST_LENGTH = 4 * ((DIGEST_LENGTH + 2) / 3);
    private String traceId;

    //   w3GnyrjE6ffi/COWRFsVTw==
    //   w3GnyrjE6ffi/COWRFsVTw==
    public static void main(String[] args) {

        String src = "苏州市@OHH@郑州市@ZAF@2024-11-08";


//        String s1 = EncoderByMd5(src);
//        System.out.println(s1);

        try {
            digestTarget = new byte[DIGEST_LENGTH];
            dst = new byte[DST_LENGTH];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(src.getBytes(StandardCharsets.UTF_8));
            messageDigest.digest(digestTarget, 0, DIGEST_LENGTH);
            String s = new String(dst, 0, Base64.getEncoder().encode(digestTarget, dst));
            System.out.println(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String tmpString = "郑州市驻马店市漯河市ZZFLBNTLBNZLNTG851G3483";
        String md5 = DigestUtils.md5DigestAsHex(tmpString.getBytes(StandardCharsets.UTF_8)).toUpperCase();
        System.out.println(md5);
//        76ABC140EFDF8862C37C19D9B93F0074
//        76ABC140EFDF8862C37C19D9B93F0074
//        76abc140efdf8862c37c19d9b93f0074

    }

//    public static String EncoderByMd5(String str) {
//        if (str == null) {
//            return null;
//        }
//
//        try {
//            // 确定计算方法
//            MessageDigest md5 = MessageDigest.getInstance("MD5");
//            BASE64Encoder base64en = new BASE64Encoder();
//            // 加密后的字符串
//            return base64en.encode(md5.digest(str.getBytes("utf-8")));
//        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
//            return null;
//        }
//    }


}