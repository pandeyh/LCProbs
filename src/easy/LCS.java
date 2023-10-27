package easy;

//https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class LCS {

    public static String longestCommonPrefix_anotherSol(String[] strs) {

        StringBuilder sb = new StringBuilder();


        for(int i=0;i<strs[0].length(); i++){
            sb.append(strs[0].charAt(i));
        }

        int i=0;
        for(int j=1;j<strs.length;j++){
            String word = strs[j];
            i =0;
            if(sb.length() > word.length()){
                sb.delete(word.length(),sb.length());
            }
            int len = sb.length() > word.length()? word.length() : sb.length();
            while(i < len){



                    if(  word.charAt(i) != sb.charAt(i)){
                        sb.delete(i, sb.length());
                        break;

                    }

                i++;
            }

            if(sb.toString().isEmpty())
                break;
        }

        return sb.toString();

    }

    /*
    // Better Solution
     */
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<first.length();i++)
        {
            if( i<last.length() && first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));
            }
            else{
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String args[]){
        String [] strs = {"aaa","aa","aaa"};
        String s = longestCommonPrefix(strs);
        System.out.print(s);
    }
}
