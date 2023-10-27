package easy;

import java.util.HashMap;

//https://leetcode.com/problems/single-row-keyboard/

public class SinglelineKeyboard {


    public static int calculateTime(String keyboard, String word) {

        HashMap<Character, Integer> indexMap = new HashMap<Character, Integer>();

        for (int i = 0; i < keyboard.length(); i++) {
            if (!indexMap.containsKey(keyboard.charAt(i))) {
                indexMap.put(keyboard.charAt(i), i);
            }
        }

        int lastIndex = indexMap.get(word.charAt(0));
        int t1 =  lastIndex;
        for (int i = 1; i < word.length(); i++) {
            t1 += Math.abs(lastIndex - indexMap.get(word.charAt(i)));
            lastIndex = indexMap.get(word.charAt(i));
        }

        return t1;
    }

    public static void main(String args[]){
        String keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode";
        int n = calculateTime(keyboard, word);

        System.out.print(n);
    }
}
