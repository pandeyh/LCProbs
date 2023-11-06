package easy;

import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/sum-of-unique-elements/description/
public class SumOfUnique {

    public int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            hMap.put(nums[i], hMap.getOrDefault(nums[i], 0) + 1);
            if(hMap.get(nums[i]) == 1){
                sum += nums[i];
            }

            if(hMap.get(nums[i]) > 1){
                sum -= nums[i];
            }

        }

        return sum;

    }

    public static void main(String args[]){

        SumOfUnique s = new SumOfUnique();
        int sum = s.sumOfUnique(new int[]{1,2,3,2});
        System.out.println(sum);
    }
}
