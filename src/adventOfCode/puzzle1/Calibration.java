package adventOfCode.puzzle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://adventofcode.com/2023/day/1
public class Calibration {


    public int calculateSum(String str){



        StringBuilder sb = new StringBuilder();
        int first = -1;
        int last = str.length()-1;
        char firstC = 'a';
        char lastC = 'a';
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(Character.isDigit(c)){

                    if(firstC == 'a')
                    {
                        firstC = c;
                    }
                    else{
                        lastC = c;
                    }


            }
        }

        if(lastC == 'a') // no last digit
        {
            lastC = firstC;
        }
         sb.append(firstC).append(lastC);


        int n = Integer.valueOf(sb.toString());


        return n;
    }

    public static void main(String args[]) throws FileNotFoundException {
        /*
        1abc2
        pqr3stu8vwx
        a1b2c3d4e5f
        treb7uchet
         */

        String s = "pqr3st4u8vwx";
        Calibration c = new Calibration();

        File f = new File("src/adventOfCode/puzzle1/input");

        int total = 0;
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            //System.out.println(line);
            int sum = new Calibration().calculateSum(line);
            total += sum;
        }

        int sum = new Calibration().calculateSum(s);
        System.out.println("sum is --" + total);
    }

}
