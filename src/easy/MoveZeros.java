package easy;

//https://leetcode.com/problems/move-zeroes/submissions/870266370/?envType=study-plan&id=algorithm-i

public class MoveZeros {


    public static void moveZeroes(int[] nums) {

        int count =0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i];


        while (count < nums.length)
            nums[count++] = 0;

    }

    public static void main(String args[]){

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
