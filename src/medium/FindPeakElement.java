package medium;

//https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {

    public int findPeakElement(int[] nums) {

        int left = 0, right = nums.length - 1;
        while( left < right){
            int mid = left +  (right - left)/2;

            if(nums[mid] > nums[mid+1]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        FindPeakElement solution = new FindPeakElement();
        int peakIndex = solution.findPeakElement(nums);
        System.out.println("Peak element index: " + peakIndex);  // Output: Peak element index: 2
    }
}
