package medium;

import java.util.ArrayList;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=study-plan&id=algorithm-ii
public class FindRange {
    public int[] searchRange(int[] nums, int target) {

        ArrayList<Integer> range = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                range.add(i);
            }
        }
        //int[] n = range.toArray(new int[range.size()]);
        int[] n = {1, 1};
        return n;
    }
}
