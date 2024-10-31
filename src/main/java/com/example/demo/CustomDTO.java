/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;

import java.util.List;

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


    private String originFrom;
    private String originTo;
    private String fromStationCode;
    private String toStationCode;
    private String fromDateTime;
    private String toDateTime;
    private String trainNo;
    private List<SeatsBean> seats;
    private List<SameTrainPlanBean> sameTrainPlan;

    @Data
    public static class SeatsBean {
        private String price;
        private String seatName;
        private int seats;
    }

    @Data
    public class SameTrainPlanBean {
        private String beginPlace;
        private String endPlace;
        private double biScore;
        private String firRecSeatType;
        private String firRecSeatPrice;
        private String firRecSeatNum;
        private String firRecRunTimeSpan;
        private String firstFromDate;
        private String firstFromStationCode;
        private String firstQueryFromStation;
        private String firstQueryToStation;
        private String firstToStationCode;
        private String fromCity;
        private String fromCityId;
        private String fromCityShortName;
        private String fromDateTime;
        private String fromStation;
        private String fromTime;
        private String itemId;
        private String number;

        private String scoreX;
        private String secRecSeatType;
        private String secRecSeatPrice;
        private String secRecSeatNum;
        private String secRecRunTimeSpan;
        private String secondFromStationCode;
        private String secondQueryFromStation;
        private String secondQueryToStation;
        private String secondToStationCode;
        private String thirdFromStationCode;
        private String thirdQueryFromStation;
        private String thirdQueryToStation;
        private String thirdRecSeatType;
        private String thirdRecSeatPrice;
        private String thirdRecSeatNum;
        private String thirdRecRunTimeSpan;
        private String thirdToStationCode;
        private String toCity;
        private String toCityId;
        private String toCityShortName;
        private String toDateTime;
        private int toPlaceMin;
        private String toStation;
        private String toTime;
        private int totalPrice;
        private int totalTime;
        private String transferType;
        private int tripNum;
        private String typeCode;
        private int waitTime;
        private int waitTimeTwo;
    }
}