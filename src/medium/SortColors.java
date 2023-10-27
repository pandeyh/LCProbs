package medium;

import java.util.Stack;

//https://leetcode.com/problems/sort-colors/
public class SortColors {

    public static void sortColors(int[] nums) {

        Stack<Integer> st0 = new Stack<Integer>();
        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        for(int i=0;i<nums.length;i++){

            if(nums[i] == 2){ // move to the end
                st2.push(nums[i]);
            }else if(nums[i] == 1){
                st1.push(nums[i]);
            }
            else{
                st0.push(nums[i]);
            }
        }

        for(int i=0;i<nums.length; i++){

            if(!st0.isEmpty())
            {
                nums[i] = st0.pop();
                continue;
            }

            if(st0.isEmpty() && !st1.isEmpty())
            {
                nums[i] = st1.pop();
                continue;
            }

            if(st1.isEmpty() && !st2.isEmpty())
            {
                nums[i] = st2.pop();
            }

        }

    }

    public static void main(String args[]){
        int n[] = {2,0,2,1,1,0};
        sortColors(n);
    }
}
