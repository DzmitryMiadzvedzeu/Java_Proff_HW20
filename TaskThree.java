package com.telran.org.homeworktwenty;

import java.io.File;

public class TaskThree {

    public void remove (File file){
        if (!file.exists()){
            return;
        }
        if (file.isDirectory()){
            for (File f : file.listFiles()){
                remove(f);
            }
        }
        file.delete();
    }
}
