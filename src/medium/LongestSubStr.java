package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubStr {

    public int lengthOfLongestSubstring(String s) {

        StringBuilder sb = new StringBuilder();

         HashMap<Character, Integer> wordLength = new HashMap<>();
        int max = 0;

        int count = 0;
        for(int i=0,j=0; i<s.length(); ++i){

            if( wordLength.containsKey(s.charAt(i))) {
                 j = Math.max(j, wordLength.get(s.charAt(i))+1);
            }
            wordLength.put(s.charAt(i),1);
            max  = Math.max(max, i-j+1);

            }

        return max;
    }

    public int lengthOfLongestSubstringUsingHashSet(String s) {

        if(s.isEmpty())
            return 0;

        HashSet hs = new HashSet();

        int max = 0;
        for(int i=0;i<s.length();i++){

            if(!hs.contains(s.charAt(i)))
            {
                hs.add(s.charAt(i));
            }
            else{
                if(max < hs.size()){
                    max = hs.size();
                    hs = new HashSet();
                    hs.add(s.charAt(i));
                }
                else{
                    break;
                }

            }
        }

        return Math.max(max, hs.size());
    }


    public int lengthOfLongestSubstringHashMap(String s) {
        // Initialize variables
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            // If the character is already in the charIndex map and its index is greater than or equal to the start index
            if (charIndex.containsKey(s.charAt(end)) && charIndex.get(s.charAt(end)) >= start) {
                // Move the start index to the next index after the repeated character
                start = charIndex.get(s.charAt(end)) + 1;
            }

            charIndex.put(s.charAt(end), end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String args[]){

        int a = new LongestSubStr().lengthOfLongestSubstringHashMap("dvdf"    );

        System.out.println(" --- "  + a);
    }
}
