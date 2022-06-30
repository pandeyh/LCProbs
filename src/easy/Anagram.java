package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://leetcode.com/problems/valid-anagram/submissions/


public class Anagram {

    /**
     * ~~~~~~~~~~~ NOT EFFICIENT  ~~~~~~~~~~~
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagramBAD(String s, String t) {

        if(s.length() != t.length())
            return false;

        int j = s.length()-1;

        ArrayList<Character> sourceList = new ArrayList<Character>();

        for(int i=0;i<s.length(); i++){

            sourceList.add(s.charAt(i));
        }

        ArrayList<Character> targetList = new ArrayList<Character>();
        for(int i=0;i<t.length();i++){
            targetList.add(t.charAt(i));

        }

        Collections.sort(sourceList);
        Collections.sort(targetList);


        return sourceList.equals(targetList);
    }

    /**
     *  Better Solution
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {


        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return String.valueOf(arr1).equals(String.valueOf(arr2));
    }

    public static void main(String args[]){

       boolean isAnagram =  new Anagram().isAnagram("anagram", "nagaram");

       System.out.print(isAnagram);
    }
}
