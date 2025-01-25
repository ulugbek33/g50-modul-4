package lesson7;

import java.io.*;

public class ReaderAndWriteTest {

    public static void main(String[] args) {
        Reader();
        Write();
    }

    public static void Reader() {
        try (
                Reader reader = new FileReader("java.text");
                Writer writer = new FileWriter("copyJava.txt")) {

//            while (reader.ready()) {
//                System.out.println((char) reader.read());
//            }
            reader.transferTo(writer);

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void Write() {
        try (Writer writer=new FileWriter("writer.doc")){

            writer.write("Hello Writer");

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
