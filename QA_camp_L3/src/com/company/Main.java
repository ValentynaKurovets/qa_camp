package com.company;

import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
//create property
        Properties properties = new Properties();

        try {
//set property
            FileOutputStream fileOutputStream = new FileOutputStream("config.properties");
            properties.setProperty("browser_name", "Google Chrome");
            properties.setProperty("browser_version", "68.0.3440.106 (Official Build) (64-bit)");
//save property to project root folder
            properties.store(fileOutputStream, "Numbers configuration");

//read property
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("browser_name"));
            System.out.println(properties.getProperty("browser_version"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
//        } finally {
        }
    }
}
