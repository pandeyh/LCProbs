package easy;

import java.util.HashMap;

public class FindDiff {

    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) {
            c ^= cs;
         }
        for(char ct : t.toCharArray()) {
            c ^= ct;
         }
        return c;
    }

    public char findTheDifferenceUsingHashMap(String s, String t) {

        HashMap<Character, Integer> hMap = new HashMap<>();
        char ch = '\0';
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            hMap.put(c, hMap.getOrDefault(c, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            int count = hMap.getOrDefault(c, 0);
            if(count ==0){
                ch =  c;

            }else
            {
                hMap.put(c, count - 1);
            }
        }

        return ch;
    }

    public static void main(String args[]){
        char c = new FindDiff().findTheDifference("abcd", "bcdea");
        System.out.print(c);

        System.out.print("");

    }
}
