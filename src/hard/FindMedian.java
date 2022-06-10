package hard;

//https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/

public class FindMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int i = 0, j = 0;
        int[] nums = new int[nums1.length + nums2.length];
        int k = 0;
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++;
            } else {
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            nums[k] = nums2[j];
            j++;
            k++;
        }


        int mid = nums.length / 2;;
        double median = 0.0;

        if (nums.length % 2 == 0)//  odd
            median = (nums[mid] + nums[mid - 1]) / 2.0;
        else
            median = nums[mid];
        return median;
    }

    public static void main(String args[]) {
        int[] a = {1, 2};
        int[] b = {3};

        double median = findMedianSortedArrays(a, b);

        System.out.print("Median is " + median);


    }

}
