package easy;

import java.util.HashMap;

//https://leetcode.com/problems/contains-duplicate-ii/description/
public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                int idx = hmap.get(nums[i]);

                if(Math.abs(idx - i) <= k) {
                    return true;
                }
                else{
                    hmap.put(nums[i], i);
                }
            }else{
                hmap.put(nums[i], i);
            }

        }

        return false;

    }
    // Better solution:
    public boolean containsNearbyDuplicateBetter(int[] nums, int k) {

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            // Check if the current number is already in the map
            if (hmap.containsKey(nums[i])) {
                // If the absolute difference of indices is less than or equal to k, return true
                if (i - hmap.get(nums[i]) <= k) {
                    return true;
                }
            }
            hmap.put(nums[i], i);
        }

        return false;

    }


    // Update the index of the current number in the map


    public static void main(String args[]){
        int [] n= {1,0,1,1};
        new ContainsDuplicate().containsNearbyDuplicate(n, 1);
    }
}
