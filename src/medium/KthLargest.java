package medium;

import java.util.Stack;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {

        Stack<Integer> st = new Stack<Integer>();

        int max = Integer.MIN_VALUE;
        for(int num: nums){
            if (st.isEmpty() || num > st.peek()) {
                st.push(num);
            }
        }
        System.out.print(st);
        while(k>1){
            st.pop();
            k--;
        }

        return st.peek();

    }

    public static void main(String args[]){

        int[] n = {2,1};
        int k = 2;
        new KthLargest().findKthLargest(n,k);
    }
}
