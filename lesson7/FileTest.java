package lesson7;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {

//        File file = new File("java.txt");
//        System.out.println(file.exists());
//        System.out.println(file.canExecute());
//        System.out.println(file.isFile());

//        File file1 = new File("newFile.txt");
//        if (!file1.exists()) {
//            try {
//                file1.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

//        if (file1.exists())
//            file1.delete();

//        String absolutePath= file1.getAbsolutePath();
//        System.out.println(file1.getParent());

//        file1=file1.getAbsoluteFile();
//        System.out.println(file1);
//        System.out.println(file1.getParentFile().getParent());

        File file = new File("C:\\Users\\HP ENVY\\IdeaProjects\\");

        search(file, "java.txt");

    }

    public static void search(File file, String fileName) {
        File[] files = file.listFiles();
        if (file.isDirectory()) {
            for (File onfile : files) {
                if (onfile.getName().equals(fileName)) {
                    System.out.println(onfile.getAbsolutePath());
                    return;
                }
                if (onfile.isDirectory()) {
                    search(onfile, fileName);
                }
            }
        }
    }

    public static void showAllInner(File file) {
        File[] files = file.listFiles();
        for (File found : files) {
            System.out.println(found);
            if (found.isDirectory())
                showAllInner(found);
        }
    }
}
