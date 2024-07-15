/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.guava.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * GuavaEventListener
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-07-12 16:40
 */
public class GuavaEventListener {

    @Subscribe
    public void subscribeHelloEvent(HelloEvent event) {
        System.out.println("接收到 helloEvent,name:" + event.getEventName());
        System.out.println("处理 helloEvent,eventNo:" + event.getEventNo());

    }

    @Subscribe
    public void processObject(Object object) {
        System.out.println("process common event, class:" + object.getClass().getSimpleName());
    }

}