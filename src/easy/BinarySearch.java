package easy;

//https://leetcode.com/problems/binary-search/description/?envType=study-plan&id=algorithm-i
public class BinarySearch {
    public static int search(int[] nums, int target) {


        int start = 0;
        int end = nums.length -1 ;

        while(start < end){

            int mid = start + (end - start) /2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String args[]){

        int[] arr = new int[]{-1,0,3,5,9,12};
        int n = search(arr, 9);
        System.out.print("index is " + n);
    }
}
