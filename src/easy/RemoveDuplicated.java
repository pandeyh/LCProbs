package easy;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
public class RemoveDuplicated {

    public String removeDuplicates(String s) {


        int j = 1;
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){

            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }
            else{
                st.push(c);
            }

        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }



        return sb.reverse().toString();
    }
}
