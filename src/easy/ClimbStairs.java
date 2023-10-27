package easy;

//https://leetcode.com/problems/climbing-stairs/editorial/
public class ClimbStairs {

    public static int climbStairs(int n) {

        if (n ==1) {
            return 1;
        }

        int one = 1;
        int two = 2;
        for (int i=3;i<=n; i++){
            int temp = one + two;
            one = two;
            two = temp;
        }
        return two;

    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(  climbStairs(n)); // Output: 8
    }
}
