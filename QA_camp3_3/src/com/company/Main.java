package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = User.DIRECTOR;
        User user2 = User.STUDENT;
        User user3 = User.TEACHER;

        System.out.println(user1.getName() + "'s pass is " + user1.getPass());
        System.out.println(user2.getName() + "'s pass is " + user2.getPass());
        System.out.println(user3.getName() + "'s pass is " + user3.getPass());


//         System.out.println(user1);
//         System.out.println(user2);
//         System.out.println(user3);
    }
}