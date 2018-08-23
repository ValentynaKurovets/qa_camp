package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestClass {

    @Test
    public void add() {
        int expectedResult = 5;
        Assert.assertEquals(add(2, 3), expectedResult);
    }

    private int add(int x, int y) {
        return x + y;
    }

    @Test
    public void sub() {
        int expectedResult = 4;
        Assert.assertEquals(sub(9, 5), expectedResult);
    }

    private int sub(int x, int y) {
        return x - y;
    }

    @Test
    public void mul() {
        int expectedResult = 3;
        Assert.assertEquals(mul(3, 6), expectedResult);
    }

    private int mul(int x, int y) {
        return x * y;
    }

    @Test
    public void dis() {
        int expectedResult = 5;
        Assert.assertEquals(dis(30, 6), expectedResult);
    }

    private int dis(int x, int y) {
        return x / y;
    }
}

