package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args){

        Human human = new Human("Serhii", 37);

        try {
            FileOutputStream fileOut = new FileOutputStream("human.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//write object to file
            out.writeObject(human);

            out.close();
            fileOut.close();

            FileInputStream fileToRead = new FileInputStream("human.ser");
            ObjectInputStream in = new ObjectInputStream(fileToRead);
//read object
            human = (Human) in.readObject();

            fileToRead.close();
            in.close();
            System.out.println(human.humanData());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

