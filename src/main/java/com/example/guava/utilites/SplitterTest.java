package com.example.guava.utilites;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;

public class SplitterTest {


    @Test
    public void testSplitOn() {
        List<String> strings = Splitter.on("|").splitToList("hello|world");
    }


}
