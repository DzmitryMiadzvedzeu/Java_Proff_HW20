package com.telran.org.homeworktwenty;

import java.io.File;

public class TaskThreeAPP {
    public static void main(String[] args) {

        String path = "C:\\Users\\Fujitsu\\IdeaProjects\\JavaProff\\src\\main\\java\\com\\telran\\org\\newDirectory\\superNew";
        TaskThree rem = new TaskThree();
        rem.remove(new File (path));
    }
}
