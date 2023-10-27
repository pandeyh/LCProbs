package easy;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {

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

        return start+1;
    }

    public static void main(String args[]){

        int[] arr = new int[]{-1,0,3,5,9,12};
        int n = searchInsert(arr, 8);
        System.out.print("index is " + n);
    }
}
