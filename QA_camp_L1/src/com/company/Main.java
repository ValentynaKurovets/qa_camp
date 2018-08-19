package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
//writing the string to a file encoded as modified UTF8
            DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("src/file.txt"));
            dataOut.writeUTF("ELEKS QA camp");
//reading data from the same file
            DataInputStream dataIn = new DataInputStream(new FileInputStream("src/file.txt"));
            while (dataIn.available() > 0) {
                String k = dataIn.readUTF();
            }
            dataOut.close();
            dataIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {}

    }
}


