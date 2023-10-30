package easy;

import java.util.HashMap;

//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class FirstUniqueChar {

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> cMap = new HashMap<Character, Integer>();
        int len = s.length();
        for(int i=0;i<len; i++){
            char c = s.charAt(i);

            cMap.put(c, cMap.getOrDefault(c,0) + 1);

        }
        System.out.print(cMap);
        for(int i=0;i<len; i++){
            if(cMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
