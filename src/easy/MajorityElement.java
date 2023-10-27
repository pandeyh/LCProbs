package easy;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/majority-element/submissions/1004909507/?envType=study-plan-v2&envId=top-interview-150
public class MajorityElement {

    public int majorityElement(int[] nums) {

        int c = nums.length/2;
        int counter= 0;
        HashMap<Integer, Integer> nMap = new HashMap<>();
        int max = 0;

        for (int i =0; i< nums.length; i++)
        {
            if(nMap.containsKey(nums[i])){
                nMap.put(nums[i], nMap.get(nums[i])+1);
            }
            else{
                nMap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map: nMap.entrySet()){

            if(map.getValue() > c){
                return map.getKey();
            }
        }

        return -1;
    }

    // efficient solution

    public int getMajorityElement(int [] nums){

        int majority = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }

    public static void main(String args[]){
        int []n = new int[]{3,2,3};
        new MajorityElement().getMajorityElement(n);

    }
}
