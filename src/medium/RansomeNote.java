package medium;

import java.util.HashMap;
import java.util.HashSet;

public class RansomeNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> hMap = new HashMap<>();
        int count = 0;

        for(char c: magazine.toCharArray())
        {

            if(hMap.containsKey(c))
            {
                hMap.put(c, hMap.get(c) + 1);
            }
            else{
                hMap.put(c, 1);
            }
        }

        for(char c: ransomNote.toCharArray())
        {

            if(hMap.containsKey(c) && hMap.get(c) > 0)
            {
                hMap.put(c, hMap.get(c) - 1);
            }
            else{
                return false;
            }
        }

        return true;



        /*for(int i=0;i<ransomNote.length();i++){

            if(!cSet.isEmpty() && cSet.contains(ransomNote.charAt(i)))
            {
                cSet.remove(ransomNote.charAt(i));
                count++;
            }


        }
        if(count == ransomNote.length())
        {
            return true;
        }
        return false;*/
    }

    public static void main(String args[]){
        String ransomNote = "a", magazine = "b";
        boolean b = new RansomeNote().canConstruct(ransomNote, magazine);
        System.out.println(b);
    }
}
