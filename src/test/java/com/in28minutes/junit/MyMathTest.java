package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {

    private MyMath math = new MyMath();
    @Test
    void calculateSum_ZeroLengthArray() {

        assertEquals(0, math.calculateSum(new int[]{}));

    }
    @Test
    void calculateSum_ThreeMemberArray() {

        assertEquals(6, math.calculateSum(new int[]{1,2,3}));

    }
}
