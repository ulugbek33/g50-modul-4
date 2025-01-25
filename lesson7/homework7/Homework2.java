package lesson7.homework7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Homework2 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("java.txt"))) {

            int count = 0;
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("count = " + count);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
