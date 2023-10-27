package easy;

import java.util.HashMap;

public class ArrayRotate {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases when k is greater than or equal to n

        int[] temp = new int[k];

        // Copy the last k elements to the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift the remaining elements k steps to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Copy the elements from the temp array back to the beginning of the nums array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 3;
        rotate(nums, k);

        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println(5/2 + " -- " + 5%2);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.values();
    }
}
