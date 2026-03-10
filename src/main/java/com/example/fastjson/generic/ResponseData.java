/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.fastjson.generic;

import lombok.Data;

import java.util.List;

/**
 * ResponseData
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-03-10 22:45
 */
@Data
public class ResponseData<T extends BaseData> {

    private String code;
    private String message;

    private Result<T> result;

    @Data
    public static class Result<T> {

        private String took;

        private List<T> data;
    }
}
