package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    private WordCount target;

    @Before
    public void setup() {
        target = new WordCount();
    }

//    public void countOneWord() {
//        Map<String, Integer> actualWordCount = new HashMap<String, Integer>();
//        final Map<String, Integer> expectedWordCount = new HashMap<String, Integer>();
//        expectedWordCount.put("word", 1);
//
//        actualWordCount = wordCount.phrase("word");
//        assertEquals(
//                expectedWordCount, actualWordCount
//        );

    @Test
    public void babablacksheep_test() {

        String[] actualWordCount = new String[] {"ba", "ba", "black", "sheep"};
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("ba", 2);
        testMap.put("black", 1);
        testMap.put("sheep", 1);

       Map<String, Integer> result = target.getCount(actualWordCount);

       Assert.assertEquals(testMap, result);
    }

    @Test
    public void abc_test() {

        String[] actualWordCount = new String[]{"a", "b", "b", "c"};
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("a", 1);
        testMap.put("b", 2);
        testMap.put("c", 1);

        Map<String, Integer> result = target.getCount(actualWordCount);

        Assert.assertEquals(testMap, result);
    }

    @Test
    public void emptystring_test() {

        String[] actualWordCount = new String[]{""};
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("", 1);

        Map<String, Integer> result = target.getCount(actualWordCount);

        Assert.assertEquals(testMap, result);
    }

    @Test
    public void cba_test() {

        String[] actualWordCount = new String[]{"c", "b", "a"};
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("c", 1);
        testMap.put("b", 1);
        testMap.put("a", 1);

        Map<String, Integer> result = target.getCount(actualWordCount);

        Assert.assertEquals(testMap, result);
    }
}
