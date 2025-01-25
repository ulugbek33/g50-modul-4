package lesson7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamTest {

    public static void main(String[] args) {
        DataInputStrem();
        DataOutputStrem();
    }

    public static void DataInputStrem() {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.txt"))) {

            System.out.println("dataInputStream= "+dataInputStream.readFloat());
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void DataOutputStrem() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"))) {

            dataOutputStream.writeFloat(97.85F);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
