package easy;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class ReverseWords {

    public String reverseWords(String s) {

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(String word: words){
            char[] chars = word.toCharArray();

            for(int j=0;j<chars.length/2; j++){
                char temp = chars[j];
                chars[j] = chars[chars.length-1 -j];
                chars[chars.length-1 - j] = temp;
            }
            sb.append(new String(chars)).append(" ");

        }

        return sb.toString().trim();
    }

    public static void main(String args[]){
        ReverseWords rw = new ReverseWords();
       String s =  rw.reverseWords("Let's take LeetCode contest");

       System.out.println(s);
    }
}
