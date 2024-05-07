/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * CustomObject
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-04-08 10:06
 */

@Data
public class CustomDTO {

    private String field1;

    private int field2;

    private int score;

    public CustomDTO(String field1, int field2, int score) {
        this.field1 = field1;
        this.field2 = field2;
        this.score = score;
    }


}