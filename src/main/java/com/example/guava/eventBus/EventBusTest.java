/**
 * LY.com Inc.
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.guava.eventBus;

import com.google.common.eventbus.EventBus;

/**
 * EventBusTest
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2024-07-12 16:27
 */
public class EventBusTest {


    public static void main(String[] args) {

        //1.创建事件总线
        EventBus eventBus = new EventBus();
        //2.创建监听器
        GuavaEventListener listener = new GuavaEventListener();
        //3.事件总线注册监听器
        eventBus.register(listener);
        //4.发送事件消息
        eventBus.post(new HelloEvent(12, "hello"));
        //5.发送完消息，必须取消监听器
        eventBus.unregister(listener);


    }


}