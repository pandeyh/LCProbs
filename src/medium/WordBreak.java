package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordBreak {

    public static  boolean wordBreak(String s, List<String> wordDict) {

        HashMap<Character, List<String>> wordMap  = new HashMap<Character, List<String>>();

        for(String word: wordDict){

            if(wordMap.containsKey(word.charAt(0))){

                List<String> tmpList = wordMap.get(word.charAt(0));
                tmpList.add(word);
                wordMap.put(word.charAt(0), tmpList);
            }
            else{
                List<String> wordList = new ArrayList<>();
                wordList.add(word);
                wordMap.put(word.charAt(0), wordList);
            }

        }

        for(int i=0;i<s.length();){

            if(wordMap.containsKey(s.charAt(i))){
                List<String> words = wordMap.get(s.charAt(i));

                for(String word : words){
                    if(s.length() >= i+word.length() && s.substring(i, i+word.length()).equals(word)){
                        i += word.length();
                    }
                }

                if(i == s.length())
                    return true;

            }
            else{
                i++;
            }
        }

        return false;

    }


    public static void main(String args[]){

        List<String> words = new ArrayList<>();
        words.add("car");
        words.add("ca");
        words.add("rs");
        //words.add("bbbb");

        String word = "cars";
        boolean isFound = wordBreak(word, words);
        System.out.print(isFound);

    }
}
