/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.demo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * TripDTO
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-10-31 15:11
 */

@Data
public class TripDTO {
    private String category;
    private String id;
    private List<RoutesDTO> routes;
    private String state;
    private long timestamp;


    @Data
    public class RoutesDTO {
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
        private Map<String, LabelItem> labels;
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
    public class FeatureDTO {
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
    public class LimitDTO {
        private Object detail;
        private int max;
        private int min;
    }

    @Data
    public class LabelItem {
        private String category;
        private int id;
        private String image;
        private String name;
        private int priority;
        private int style;
        private String target;
        private String tip;
    }


    @Data
    public class SupplierDTO {
        private String id;
        private String key;
        private String name;
    }


    @Data
    public class ArrStationsDTO {
        private String code;
        private List<?> coordinates;
        private String id;
        private String name;
        private String time;
    }


    @Data
    public class DepStationsDTO {
        private String code;
        private List<CoordinatesDTO> coordinates;
        private String id;
        private String name;
        private String time;
    }

    @Data
    public class CoordinatesDTO {
        private String lat;
        private String lon;
    }


    @Data
    public class PriceQuotesDTO {
        private String arrStationId;
        private String depStationId;
        private String priceKey;
        private List<PricesDTO> prices;
    }

    @Data
    public class PricesDTO {
        private String merchantPrice;
        private String price;
        private String type;
    }
}