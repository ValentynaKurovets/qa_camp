package com.company;

public enum User {
    DIRECTOR("director", 123456),
    STUDENT("student", 345678),
    TEACHER("teacher", 234567);
    private String name;
    private int pass;

    User(final String name, final int pass) {
        this.name = name;
        this.pass = pass;
    }

    public int getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }
}