package medium;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan&id=algorithm-i
public class TwoSum {

    public  static int[] twoSum(int[] numbers, int target) {

        int len = numbers.length;
        int low = 0;
        int high = len-1;

        int[] res = new int[2];



         while(low < high){
             int sum = numbers[low] + numbers[high];

             if(sum == target){
                 res[0]= low+1;
                 res[1] = high+1;
                 return res;
             }
             else if( sum < target){
                 low +=1;
             }
             else{
                 high-=1;
             }
         }
        return new int[]{-1,-1};


    }

    public static void main(String args[]){

        int[] n = {1,2,3,4,4,9,56,90};
        int[] x = twoSum(n,8);
        System.out.print(x[0] + " -- " + x[1]);

        StringBuffer sb = new StringBuffer();

    }
}
