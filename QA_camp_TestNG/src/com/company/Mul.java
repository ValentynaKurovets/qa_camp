package com.company;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mul {

    private int mul(int x, int y) {
        return x * y;
    }

    @Test(groups = "successful_group")
    public void mulSuccess() {
        int expectedResult = 18;
        Assert.assertEquals(mul(3, 6), expectedResult);
    }

    @Test(groups = "failure_group")
    public void mulFail() {
        int expectedResult = 3;
        Assert.assertEquals(mul(3, 6), expectedResult);
    }

    @BeforeClass
    private void beforeClass() {
        System.out.println("Test Class " + getClass().getName() + " is loaded");
    }

    @AfterClass
    private void afterClass() {
        System.out.println("Test Class " + getClass().getName() + " is finished");
    }
}
