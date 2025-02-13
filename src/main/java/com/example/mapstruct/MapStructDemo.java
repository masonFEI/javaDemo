/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.mapstruct;

/**
 * MapStructDemo
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-12 13:34
 */
public class MapStructDemo {


    public static void main(String[] args) {
        // 创建源对象
        Source source = new Source();
        source.setName("John Doe");
        source.setAge(30);
        // 调用映射方法
        Target target = SourceTargetMapper.INSTANCE.sourceToTarget(source);

        // 输出结果
        System.out.println("Full Name: " + target.getFullName());
        System.out.println("Years Old: " + target.getYearsOld());
    }

}