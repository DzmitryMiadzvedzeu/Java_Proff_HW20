package com.telran.org.homeworktwenty;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class TaskTwo {
    public static void main(String[] args) {

        String pathToFile = "C:\\Users\\Fujitsu\\Desktop";

        File newFile = new File(pathToFile + "Homework_file.txt");
        try {
            FileOutputStream fos = new FileOutputStream(newFile);
            String v = "Task Two = success";
            fos.write(v.getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
