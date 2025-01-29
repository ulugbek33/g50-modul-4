package imtihonUchunTopshiriqlar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNumberExtractor {

    public static void main(String[] args) {

        String folderPath = "C:\\Users\\HP ENVY\\IdeaProjects\\g50\\g50-modul-4\\untitled\\folder";
        String fileName = "example.txt";

        File file = new File(folderPath, fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            List<Integer> list = new ArrayList<>();
            Pattern pattern = Pattern.compile("\\d");

            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    int number = Integer.parseInt(matcher.group());
                    list.add(number);
                }
            }
            if (list.size() > 1)
                System.out.println(" sonlar -->" + list);
            else
                System.err.println("Sizning fayilingizda sonla 1 dan kop bolishi kerak !!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
