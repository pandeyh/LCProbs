package easy;

import java.util.HashSet;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/
class AllowedWords {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;
        int len = allowed.length();

        HashSet<Character> allowedSet = new HashSet<>();

        for(char c: allowed.toCharArray()) {
            allowedSet.add(c);
        }


        for(  String word: words) {
            if(isInAllowed(word, allowedSet))
            {
                count++;
            }

        }

        return count;
    }

    public boolean isInAllowed(String word, HashSet ch){

        for(char c: word.toCharArray()){
            if(!ch.contains(c)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        AllowedWords counter = new AllowedWords();
        int result = counter.countConsistentStrings(allowed, words);
        System.out.println(result); // Output will be 7
    }
}
