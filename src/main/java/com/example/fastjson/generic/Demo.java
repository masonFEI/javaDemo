/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.fastjson.generic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

/**
 * Demo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-03-10 22:48
 */
public class Demo {

    public static void main(String[] args) {

        String cityJson = "{\"code\":\"200\",\"message\":\"success\",\"result\":{\"took\":\"100ms\",\"data\":[{\"id\":\"1\",\"city\":\"Beijing\"},{\"id\":\"2\",\"city\":\"Shanghai\"}]}}";

        ResponseData<CityData> cityResponse = parseResponse(cityJson, new TypeReference<ResponseData<CityData>>() {
        });
        System.out.println("City Response: " + cityResponse);

        String holidayJson = "{\"code\":\"200\",\"message\":\"success\",\"result\":{\"took\":\"100ms\",\"data\":[{\"id\":\"1\",\"date\":\"2026-01-01\"},{\"id\":\"2\",\"date\":\"2026-02-11\"}]}}";
        ResponseData<Holiday> holidayResponseData = parseResponse(holidayJson, new TypeReference<ResponseData<Holiday>>() {
        });
        System.out.println("Holiday Response: " + holidayResponseData);
    }


    private static <T extends BaseData> ResponseData<T> parseResponse(String json, TypeReference<ResponseData<T>> typeReference) {
        ResponseData<T> responseData = JSON.parseObject(json, new TypeReference<ResponseData<T>>() {
        });
        int size = responseData.getResult().getData().size();
        System.out.println(size);
        return responseData;
    }

}
