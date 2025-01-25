package lesson7;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputAndOutputBufferendStreamTest {

    public static void main(String[] args) {

//        inputBufferendStream();
        outputBufferendStream();
    }

    public static void inputBufferendStream() {

        try (BufferedInputStream buffered = new BufferedInputStream(new FileInputStream("java.txt"))) {

            while (buffered.available() > 0) {
                System.out.print((char) buffered.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputBufferendStream() {
        try (BufferedOutputStream buffered = new BufferedOutputStream(new FileOutputStream("java.txt"))) {

            String string = "Hello Anvar";
            byte[] bytes = string.getBytes();
            buffered.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
