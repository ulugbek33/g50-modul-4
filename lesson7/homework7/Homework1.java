package lesson7.homework7;

import java.io.*;

public class Homework1 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\HP ENVY\\IdeaProjects\\");

        searchFile(file, "java.txt");
    }

    public static void searchFile(File file, String fileName) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File onfile : files) {
                    if (onfile.isDirectory()) {
                        if (onfile.getName().contains(fileName))
                            System.out.println("Papka topildi : " + onfile.getAbsolutePath());
                        searchFile(onfile, fileName);
                    } else {
                        if (onfile.getName().contains(fileName))
                            System.out.println("Fayil topildi: " + onfile.getAbsolutePath());
                    }
                }
            }
        }
    }
}
