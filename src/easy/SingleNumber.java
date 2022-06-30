package easy;

//https://leetcode.com/problems/single-number/
public class SingleNumber {

    public int singleNumber(int[] nums) {


        int ans = 0;

        for(int i=0;i<nums.length; i++){

            ans ^= nums[i];
        }

        return ans;
    }

    public static void main(String args[]){
        int [] n = {4,1,2,1,2};
       int a =  new SingleNumber().singleNumber(n);
       System.out.print(a);
    }
}
