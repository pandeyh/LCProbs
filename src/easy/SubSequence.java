package easy;


//https://leetcode.com/problems/is-subsequence/submissions/1086994151/
public class SubSequence {
    public boolean isSubsequence(String s, String t) {

        if(s.isEmpty())
            return true;

        int j=0;
        for(int i=0;i<t.length();i++){

            if(s.charAt(j) == t.charAt(i))// found match
            {
                j++; //check for next character
            }

            if(j == s.length())
            {
                return true;
            }
        }

        return false;

    }

    public static void main(String args[]){

        SubSequence s = new SubSequence();
        boolean b = s.isSubsequence("abc", "abec");
        System.out.println(b);

    }
}
