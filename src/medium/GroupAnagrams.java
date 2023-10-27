package medium;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList<List<String>> groups = new ArrayList<List<String>>();

        HashMap<String, ArrayList<String>> anagramGroups = new HashMap<String,  ArrayList<String>>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // If the sorted string is already present in the map, add the word to its list.
            // Otherwise, create a new list and add the word to that list.
            anagramGroups.putIfAbsent(sortedStr, new ArrayList<>());
            anagramGroups.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String args[]){
        String[] sts = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> str = new GroupAnagrams().groupAnagrams(sts);
    }
}
