/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.example.juc;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * MapAtomicReferenceUpdaterDemo
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-06-02 15:52
 */

public class MapAtomicReferenceUpdaterDemo {

    public static void main(String[] args) throws InterruptedException {

        SameTrainRepository sameTrainRepository = new SameTrainRepository();
        int threadNums = 5;

        CountDownLatch countDownLatch = new CountDownLatch(threadNums);

        for (int i = 0; i < threadNums; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    List<SameTrainTransferStation> stations = new ArrayList<>();
                    for (int j = 0; j < 10; j++) {
                        int id = new Random().nextInt(100) + 1;
                        stations.add(new SameTrainTransferStation(id, finalI + "@" + j + "@" + id));
                    }

                    sameTrainRepository.addSameTrainTransferStation(UUID.randomUUID().toString(), stations);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    countDownLatch.countDown();
                }
            }, String.valueOf(i)).start();
        }

        countDownLatch.await();

        System.out.println(sameTrainRepository);


        new ConcurrentHashMap();

    }

}

class SameTrainRepository {

    private volatile Map<String, List<SameTrainTransferStation>>               cache        = new LinkedHashMap<>(100000);

    private static final AtomicReferenceFieldUpdater<SameTrainRepository, Map> fieldUpdater = AtomicReferenceFieldUpdater.newUpdater(SameTrainRepository.class,
        Map.class, "cache");

    public void addSameTrainTransferStation(String key, List<SameTrainTransferStation> values) {
        fieldUpdater.getAndUpdate(this, oMap -> {
            oMap.put(key, values);
            return oMap;
        });
    }

}

@Data
@AllArgsConstructor
class SameTrainTransferStation {

    private int    id;

    private String name;

}
