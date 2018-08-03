package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Main {

    @Before
    public void startPrint() {
        System.out.println("Start printing user credentials");
    }

    @Test
    public void printUserCredentials() {
        System.out.println(user1.getName() + "'s pass is " + user1.getPass());
        System.out.println(user2.getName() + "'s pass is " + user2.getPass());
        System.out.println(user3.getName() + "'s pass is " + user3.getPass());
    }

    @After
    public void finishPrint() {
        System.out.println( "Finish printing user credential");
    }
}
