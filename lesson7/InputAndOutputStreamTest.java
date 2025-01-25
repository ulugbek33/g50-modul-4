package lesson7;

import java.io.*;
import java.util.Arrays;

public class InputAndOutputStreamTest {

    public static void main(String[] args) {

//        inputStrem();
        outputStream();
    }

    public static void outputStream() {
        File file = new File("java.txt");

        try (OutputStream outputStream = new FileOutputStream(file)) {

            String string = "Hello Ulugbek";
            byte[] bytes = string.getBytes();
            outputStream.write(bytes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void inputStrem() {
        File file = new File("java.txt");

        try (InputStream inputStream = new FileInputStream(file)) {

            byte[] bytes = inputStream.readAllBytes();
            System.out.println(new String(bytes));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

