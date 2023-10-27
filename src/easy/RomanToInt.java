package easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInt {

    public int romanToInt(String s) {

        Map<Character, Integer> valMap = new HashMap<Character, Integer>();

        valMap.put('I', 1);
        valMap.put('V', 5);
        valMap.put('X', 10);
        valMap.put('L', 50);
        valMap.put('C', 100);
        valMap.put('D', 500);
        valMap.put('M', 1000);

        int sum = 0;
        char lastChar = s.charAt(s.length()-1);
        for(int i=s.length()-1;i>=0;i--) {

            char c = s.charAt(i);

            int currVal = valMap.get(c);
            int lastVal = valMap.get(lastChar);
            if(currVal < lastVal){
                sum -= currVal;
            }
            else{
                sum += currVal;
            }
            lastChar = c;
        }


        return sum;
    }

    public static void main(String args[]){

        int n = new RomanToInt().romanToInt("MCMXCIV");
        System.out.println(n);
    }
}
