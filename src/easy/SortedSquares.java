package easy;
//https://leetcode.com/problems/squares-of-a-sorted-array/?envType=study-plan&id=algorithm-i
public class SortedSquares {

    public  static int[] sortedSquares(int[] nums) {

        int left =0;
        int right = nums.length -1;

        int[] res = new int[nums.length];

        for(int i=nums.length - 1;i>0; i--){

            int square = 0;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right --;
            }
            else{
                square = nums[left];
                left ++;
            }

            res[i] = square*square;

        }

        return res;
    }

    public static void main(String args[]){
        int[] n = {-4,-1,0,3,10};
        int[] res = sortedSquares(n);

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }


    }
}
