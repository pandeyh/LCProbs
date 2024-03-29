package easy;

//https://leetcode.com/problems/single-number/
public class SingleNumber {

    public int singleNumber(int[] nums) {


        int ans = 0;

        for(int i=0;i<nums.length; i++){

            ans ^= nums[i]; // XOR same number will give 0 and Xoring with 0 gives the number itself
        }

        return ans;
    }

    public static void main(String args[]){
        int [] n = {4,1,2,1,2};
       int a =  new SingleNumber().singleNumber(n);
       System.out.print(a);
    }
}
