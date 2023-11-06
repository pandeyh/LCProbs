package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortingTheSentence {

    public String sortSentenceUsingMap(String s) {

        String[] words = s.split("\\s+");

        HashMap<Integer, String> idMap = new HashMap<>();

        for(String word:words){
            int idx = (int) word.charAt(word.length()-1);
            idMap.put(idx, word.substring(0, word.length()-1));

        }

        List<Integer> sortedKeys = new ArrayList<>(idMap.keySet());
        Collections.sort(sortedKeys);

        StringBuilder sb = new StringBuilder();
        // Iterating through the sorted keys and getting corresponding values
        for (Integer key : sortedKeys) {
            String word = idMap.get(key);
            sb.append(word).append(" ");

        }
        return sb.toString().trim();
    }


    // Another way without HashMaps
    public String sortSentence(String s) {

        String[] words = s.split("\\s+");

        String[] result = new String[words.length];

        for(String word:words){
            int len = word.length() - 1;
            int idx = word.charAt(len) - '0';
            result[idx - 1] = word.substring(0, len);

        }

        /*StringBuilder sb = new StringBuilder();
        for (String word : result) {

            sb.append(word).append(" ");
        }*/

        //return sb.toString().trim();
        return String.join(" ", result);

    }

    public static void main(String args[]){

        SortingTheSentence s = new SortingTheSentence();
        String sentence = s.sortSentence("is2 sentence4 This1 a3");
        System.out.println(sentence);
    }

}
