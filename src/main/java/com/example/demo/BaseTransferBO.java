/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * BaseTransferBO
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-12-02 16:18
 */
@Data
@AllArgsConstructor
public class BaseTransferBO {

    private int score;
    private int totalTime;
    private String firstFromTime;
}