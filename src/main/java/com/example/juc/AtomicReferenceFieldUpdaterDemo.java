/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.juc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * AtomicReferenceFieldUpdaterDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-05-29 16:38
 */

class TransferCity {

    String name = "suzhou";

    private volatile List<Scheme> schemes;

    private static final AtomicReferenceFieldUpdater<TransferCity, List> fieldUpdater = AtomicReferenceFieldUpdater.newUpdater(TransferCity.class, List.class, "schemes");


    public void addSchemes(List<Scheme> schemes) {
        fieldUpdater.getAndUpdate(this, oList -> {
            if (Objects.isNull(oList)) {
                return new ArrayList<>(schemes);
            }

            List arrayList = new ArrayList<>(oList);
            arrayList.addAll(schemes);
            return arrayList;
        });
    }


    public List<Scheme> getSchemes() {
        return fieldUpdater.get(this);
    }

    @Data
    @AllArgsConstructor
    public static class Scheme {

        private int i;

        private int j;

        private String name;
    }


}


public class AtomicReferenceFieldUpdaterDemo {


    public static void main(String[] args) throws InterruptedException {
        TransferCity transferCity = new TransferCity();

        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    List<TransferCity.Scheme> schemes = new ArrayList<>();

                    for (int j = 0; j < 10; j++) {
                        schemes.add(new TransferCity.Scheme(finalI, j, UUID.randomUUID().toString()));
                    }

                    transferCity.addSchemes(schemes);
                } finally {
                    countDownLatch.countDown();
                }

            }, String.valueOf(i)).start();
        }

        countDownLatch.await();


        System.out.println(transferCity.getSchemes().size());


    }


}
