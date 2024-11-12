/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;

import java.util.List;

/**
 * BusDetail
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-11-01 17:40
 */

@Data
public class BusDetail {
    private String errorCode;
    private String errorMessage;
    private RouteDTO route;
    private boolean success;
    private String traceId;


    @Data
    public static class RouteDTO {
        private String arrCityId;
        private String arrCityName;
        private String arrStationId;
        private String arrStationName;
        private List<ArrStationsDTO> arrStations;
        private String arrType;
        private String bizBinType;
        private String bookUrl;
        private String category;
        private String coachNo;
        private String coachType;
        private int coachTypeInt;
        private String depCityId;
        private String depCityName;
        private String depDate;
        private String depDateTime;
        private String depStationId;
        private String depStationName;
        private List<DepStationsDTO> depStations;
        private String depTime;
        private String depType;
        private String discount;
        private String distance;
        private FeatureDTO feature;
        private String id;
        private Object labels;
        private int num;
        private String price;
        private List<PriceQuotesDTO> priceQuotes;
        private String remark;
        private int runTime;
        private String runTimeDesc;
        private String scheduleCalId;
        private String scheduleId;
        private String scheduleNo;
        private String sign;
        private SupplierDTO supplier;
    }


    @Data
    public static class FeatureDTO {
        private Object ancillaryData;
        private boolean extra;
        private String issueDate;
        private LimitDTO limit;
        private boolean pipeline;
        private String runningEndTime;
        private String runningStartTime;
        private int state;
        private String stopAt;
        private boolean subscribe;
        private Object ticketRefund;
        private int trainDepTimeDiffMilliSecond;
        private int trainStationApart;
        private String transfer;
        private boolean via;
    }

    @Data
    public static class LimitDTO {
        private DetailDTO detail;
        private int max;
        private int min;
    }

    @Data
    public static class DetailDTO {
        private int adtMax;
        private int chdMax;
        private int infMax;
    }

    @Data
    public static class SupplierDTO {
        private String id;
        private String key;
        private String name;
    }

    @Data
    public static class ArrStationsDTO {
        private String code;
        private List<?> coordinates;
        private String id;
        private String name;
        private String time;
    }

    @Data
    public static class DepStationsDTO {
        private String code;
        private List<?> coordinates;
        private String id;
        private String name;
        private String time;
    }

    @Data
    public static class PriceQuotesDTO {
        private String arrStationId;
        private String depStationId;
        private String priceKey;
        private List<PricesDTO> prices;
    }

    @Data
    public static class PricesDTO {
        private String merchantPrice;
        private String price;
        private String type;
    }
}