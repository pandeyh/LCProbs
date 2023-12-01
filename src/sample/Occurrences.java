package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurrences {
    public static void main(String[] args) {
        String inputString = "seven4ninefivefourhxplgzfvsevenbbdjqc";
        String pattern = "seven";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputString);

        while (m.find()) {
            System.out.println("Found at index: " + m.start());
        }
    }
}
