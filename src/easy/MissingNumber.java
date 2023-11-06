package easy;

//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  //calculate the expected sum of all numbers from 0 to n using the formula expectedSum = n * (n + 1) / 2
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String args[]){
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0,1,2,3,4,6};
        int n = missingNumber.missingNumber(nums);
        System.out.println(n);
}


}
