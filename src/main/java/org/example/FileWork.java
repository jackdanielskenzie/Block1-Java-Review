package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileWork {

    public static void myMethod() throws InterruptedException {
        try {
            Thread.sleep(10000);
            System.out.println("Pause done");
        }
        catch (Exception e) {
                String errorMessage = e.getMessage();
                throw new InterruptedException(errorMessage);
        }

        try {
            FileInputStream fileStream = new FileInputStream("myfile.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
