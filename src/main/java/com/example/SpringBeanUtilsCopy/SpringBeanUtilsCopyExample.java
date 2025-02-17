/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.SpringBeanUtilsCopy;

import org.springframework.beans.BeanUtils;

/**
 * SpringBeanUtilsCopyExample
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-17 17:02
 */
public class SpringBeanUtilsCopyExample {


    public static void main(String[] args) {
        TransferParamDTO param = new TransferParamDTO();
        param.setParam1("value1");
        param.setParam2(10);

        TransferParamDTO defaultParam = new TransferParamDTO();
        BeanUtils.copyProperties(param, defaultParam);

        // 修改 defaultParam 的值
        defaultParam.setParam1("new value");
        defaultParam.setParam2(20);

        System.out.println("param: " + param);
        System.out.println("defaultParam: " + defaultParam);
    }

}