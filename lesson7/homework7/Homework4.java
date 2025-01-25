package lesson7.homework7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Homework4 {

    public static void main(String[] args) {

        Path source = Paths.get("C:\\Users\\HP ENVY\\IdeaProjects\\G50 modul4\\data.txt");
        Path target = Paths.get("C:\\Users\\HP ENVY\\IdeaProjects\\G50 modul4\\dataCopy.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
