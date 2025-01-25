package lesson7.homework7;

import java.io.*;

public class Homework5 {

    public static void main(String[] args) {
       try (BufferedReader reader1 = new BufferedReader(new FileReader("data.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("java.txt"));
             BufferedWriter writer=new BufferedWriter(new FileWriter("manba.txt"))){

           String line;
           while ((line=reader1.readLine())!=null){
               writer.write(line);
               writer.newLine();
           } 
           while ((line=reader2.readLine())!=null){
               writer.write(line);
               writer.newLine();
           }


              } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
