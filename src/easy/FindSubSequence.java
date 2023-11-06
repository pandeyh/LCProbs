package easy;

import java.util.ArrayList;

//https://leetcode.com/problems/longest-continuous-increasing-subsequence/
public class FindSubSequence {

    public int findLengthOfLCIS(int[] nums) {

        int len = 1;
        int max = 1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                len ++;
            }else{
                len = 1;
            }
            max = Math.max(len, max);
        }

        return max;
    }

    public static void main(String args[]){

        FindSubSequence subSequence = new FindSubSequence();
        int[] nums = {1,3,5,4, 7};
       int n=  subSequence.findLengthOfLCIS(nums);
       System.out.println(n);
    }
}
