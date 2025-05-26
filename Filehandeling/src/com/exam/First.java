package com.exam;

import java.io.File;
import java.io.IOException;

public class First {
    public static void main(String[] args) throws IOException {
        // Create directory "new"
        File dir = new File("D:\\ds\\new");
        System.out.println("Directory created: " + dir.mkdir());

        // Create file "B.txt" inside the "new" directory
        File file = new File("D:\\ds\\new\\B.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Check file permissions
        System.out.println("Can execute: " + file.canExecute());
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());

        // Print the absolute path
        System.out.println("Absolute path: " + file.getAbsolutePath());
    }
}
