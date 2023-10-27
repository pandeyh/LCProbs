package medium;

import java.util.ArrayList;
import java.util.List;

public class WordBreakII {

    public static boolean wordBreak(String s, List<String> dict){

        if(s.length() == 0) return false;
        boolean[] dp = new boolean[s.length()];
        for(int i=0;i< s.length();i++){

            for(int j = 0; j<=i; j++){
             String sub = s.substring(j,i+1);
             if(dict.contains(sub) && (j ==0 || dp[j-1])){
                 dp[i] = true;
                 break;
             }
            }
        }

        return dp[s.length() - 1];
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
