package easy;

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class ReverseVowels {
    public static String reverseVowels(String s) {
        // FirstPass scan the vowels
        StringBuilder sb = new StringBuilder();

        //Queue q = new LinkedList<>();

        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='i' || c=='e' || c == 'o' || c == 'u' )
            {
                sb.append(s.charAt(i));
            }
        }

        sb.reverse();
        StringBuffer sb1 = new StringBuffer();
        int j = 0;
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='i' || c=='e' || c == 'o' || c == 'u' )
            {
                sb1.append(sb.charAt(j));
                j++;
            }
            else{
                sb1.append(c);
            }
        }

        return sb1.toString();

    }


    public static void  main(String args[]){

        String s = "hello";
        s = reverseVowels(s);
    }
}
