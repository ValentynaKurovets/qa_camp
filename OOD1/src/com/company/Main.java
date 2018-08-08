package com.company;

public class Main {

    public static void main(String[] args) {

        Email simple = new Email.Builder("Serhii", "Hi").build();
        Email withAttachment = new Email.Builder("Valya", "Test attach").withAttachment(true).build();

        System.out.println(simple.getAttachment());
        System.out.println(withAttachment.getAttachment());

    }
}