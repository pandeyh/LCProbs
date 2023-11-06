package easy;


//https://leetcode.com/problems/monotonic-array/description/
public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;
        for(int i=1;i<nums.length; i++){
            if(nums[i] <  nums[i- 1])
            {
                increasing = false;
            }

            if( nums [i] > nums[i-1])
            {
                decreasing = false;
            }

        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        MonotonicArray solution = new MonotonicArray();
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {3, 2, 1};
        int[] nums3 = {1, 3, 2};
        System.out.println(solution.isMonotonic(nums1)); // Output: true
        System.out.println(solution.isMonotonic(nums2)); // Output: true
        System.out.println(solution.isMonotonic(nums3)); // Output: false
    }
}
