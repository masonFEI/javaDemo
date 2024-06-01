package com.example.guava.utilites;

import com.google.common.base.Joiner;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JoinerTest {


    private final List<String> stringList = Arrays.asList(
            "google", "Guava", "Java", "Scala", "Kafka"
    );


    @Test
    public void testJoiner() {
        String result = Joiner.on("#").join(stringList);

    }

}
