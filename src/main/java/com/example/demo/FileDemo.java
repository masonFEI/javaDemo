/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * FileDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-07-18 10:51
 */
public class FileDemo {


    public static void main(String[] args) {
        String response = "";
        File file = new File("D:\\code\\javaProject\\TC.WisdomTravel.Transfer.FrontStage.Union\\TransferplanGatewayMain\\src\\main\\resources\\env\\test\\sameTrain.txt");
        try {
            response = FileUtils.readFileToString(file, "utf-8");
        } catch (Exception e) {
        }
    }


}