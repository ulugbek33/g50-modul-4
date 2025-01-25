package lesson7.homework7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Homework3 {

    public static void main(String[] args) {

        String str = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("java.txt"))) {

            String line;
            while ((line = reader.readLine()) != null){

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > str.length())
                        str = word;
                }
            }
            if (!str.isEmpty())
                System.out.println("str = " + str);
            else
                System.out.println("Fayil topilmadi: ");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
