package com.telran.org.homeworktwenty;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class TaskOne {
    public static void main(String[] args) {

        String pathToFile = "C:\\Users\\Fujitsu\\IdeaProjects\\JavaProff\\src\\main\\java\\com\\telran\\org\\homeworktwenty";
        String fileData = "This is my first experience when I myself work with IO API. I can do everything!";

        try {
            FileOutputStream textInFile = new FileOutputStream(pathToFile + "\\HW_filesss.txt");
            textInFile.write(fileData.getBytes(StandardCharsets.UTF_8));
            textInFile.flush();
            textInFile.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
