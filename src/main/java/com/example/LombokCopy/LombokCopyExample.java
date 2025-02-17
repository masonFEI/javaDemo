/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.LombokCopy;


/**
 * LombokCopyExample
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-17 16:54
 */
public class LombokCopyExample {


    public static void main(String[] args) {
        TransferParamDTOWithLombok param = TransferParamDTOWithLombok.builder()
                .param1("value1")
                .param2(10)
                .build();

        TransferParamDTOWithLombok defaultParam = param.toBuilder().build();

        // 修改 defaultParam 的值
        defaultParam.setParam1("new value");
        defaultParam.setParam2(20);

        System.out.println("param: " + param);
        System.out.println("defaultParam: " + defaultParam);
    }


}