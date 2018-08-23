package com.company;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dis {

    private int dis(int x, int y) {
        return x / y;
    }

    @Test(groups = "successful_group")
    public void disSuccess() {
        int expectedResult = 5;
        Assert.assertEquals(dis(30, 6), expectedResult);
    }

    @Test(groups = "failure_group")
    public void disFail() {
        int expectedResult = 2;
        Assert.assertEquals(dis(30, 6), expectedResult);
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
