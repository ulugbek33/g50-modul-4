package lesson7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderAndWrite {

    public static void main(String[] args) {
        BufferedReader();
//        BufferedWrite();
    }

    public static void BufferedReader() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {

            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void BufferedWrite() {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dataCopy.txt"))) {

            bufferedWriter.write("Bu test uchun yaratildi ");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
