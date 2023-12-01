package adventOfCode.puzzle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
public class Calibration_II {

    public int calculateSum(String str){

        HashMap<String,Integer> valMap = new HashMap<>();

        valMap.put("one", 1);
        valMap.put("two", 2);
        valMap.put("three", 3);
        valMap.put("four", 4);
        valMap.put("five", 5);
        valMap.put("six", 6);
        valMap.put("seven", 7);
        valMap.put("eight", 8);
        valMap.put("nine", 9);
        valMap.put("zero", 0);
        StringBuilder sb = new StringBuilder();


        int[] idx = new int[2];
        int firstC = -1;
        int lastC = -1;
        for(int i=0;i<str.length();i++){

            char c = str.charAt(i);

            if(Character.isDigit(c)){

                if(firstC == -1)
                {
                    firstC = c - '0';
                    idx[0] = i;
                }
                else{
                    lastC = c - '0';
                    idx[1] = i;
                }
            }
        }

        if(idx[1] == 0){ // not found
            idx[1] = idx[0];
            lastC = firstC;
        }

        for(String key: valMap.keySet()){

            if(str.contains(key)){
                Pattern p = Pattern.compile(key);
                Matcher m = p.matcher(str);
                int subStrIdx =  str.indexOf(key);
                while (m.find()) {
                    subStrIdx = m.start();

                    if(subStrIdx <= idx[0]){
                        idx[0] = subStrIdx;
                        firstC = valMap.get(key);
                    }
                    else if(subStrIdx > idx[1])
                    {
                        idx[1] = subStrIdx;
                        lastC = valMap.get(key);
                    }

                }

            }
        }

        if(lastC == -1) // no last digit
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

        String s = "cmczrnjjsntptjffzrpqthreemjpfhsjbrmnlkzpvvvmj8";
        Calibration c = new Calibration();

        File f = new File("src/adventOfCode/puzzle1/input");

        int total = 0;
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            //System.out.println(line);
            int sum = new Calibration_II().calculateSum(line);
           total += sum;
            //total += 0;
        }

        int sum = new Calibration_II().calculateSum(s);
        System.out.println("sum is --" + total);
    }
}
