package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/submissions/
public class FindDups {

    /**
     * Using HashMap
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> nMap = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){

            if(nMap.containsKey(nums[i]) ){
                //nMap.put(nums[i], nMap.get(nums[i])+1);
                return true;
            }

            else
                nMap.put(nums[i], 1);
        }

        return false;

    }

    /**
     * Using Set
     * @param nums
     * @return
     */
    public boolean containsDuplicateInSet(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!numSet.add(nums[i])){
                return true;
            }
        }

        return false;
    }

}
