/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * TrainResponse
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-04-07 18:59
 */
@NoArgsConstructor
@Data
public class TrainResponse {


    private int code;
    private String message;
    private String error;
    private int status;
    private int usedtime;
    private String srvtime;
    private int islogin;
    private boolean iswork;
    private String tag;
    private boolean result;
    private String errorCode;
    private String traceId;
    private String headStationName;
    private String tailStationName;
    private String trainNo;
    private String trainType;
    private String trainCode;
    private List<StopStationsBean> stopStations;

    @NoArgsConstructor
    @Data
    public static class StopStationsBean {
        private String arriveDays;
        private String stationName;
        private String stationNo;
        private String stationCode;
        private String depTime;
        private String stopoverTime;
        private String arrTime;
    }
}