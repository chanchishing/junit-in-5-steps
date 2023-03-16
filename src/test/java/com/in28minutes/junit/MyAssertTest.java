package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS","Azure","DevOps");
    @Test
    void test(){
        boolean test =todos.contains("AWS");
        assertEquals(true,test);
        assertEquals(3,todos.size());


    }
}
