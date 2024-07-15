/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.guava.eventBus;

/**
 * HelloEvent
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-07-12 16:41
 */
public class HelloEvent {


    private int eventNo;

    private String eventName;

    public HelloEvent(int eventNo, String eventName) {
        this.eventNo = eventNo;
        this.eventName = eventName;
    }


    public int getEventNo() {
        return eventNo;
    }

    public void setEventNo(int eventNo) {
        this.eventNo = eventNo;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "HelloEvent{" +
                "eventNo=" + eventNo +
                ", eventName='" + eventName + '\'' +
                '}';
    }

}