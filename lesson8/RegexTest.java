package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {

//        task1();
//    phoneNumber();
//example@gmail.com
//        task3();
        Pattern pattern=Pattern.compile("^");
        Matcher matcher=pattern.matcher("Apple is amazing, and art is fun");

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    private static void task3() {
        Pattern pattern = Pattern.compile("[0-9]{3,}");
        Matcher matcher = pattern.matcher("abc1239def456");

        System.out.print("[");
        while (matcher.find()) {
            System.out.print(matcher.group()+",");
        }
        System.out.print("]");
    }

    private static void task1() {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("abcgdh67jhdj8***&kdfdkjfhD9");

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("count = " + count);
    }

    public static void phoneNumber() {

        Pattern pattern = Pattern.compile("^\\+998[0-9]{9}$");
        Matcher matcher = pattern.matcher("+998880831405");

        if (!matcher.find())
            System.err.print("invalid nomer");
        else
            System.out.println(matcher.group());
    }
}
