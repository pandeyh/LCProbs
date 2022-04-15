package easy;

//LC - https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class ProdSumDiff {

    public static int subtractProductAndSum(int n) {

        int prod = 1;
        int sum =0;

        int num = n;

        while(num>0){

            int dig = num%10;
            num = num/10;

            prod *=dig;
            sum +=dig;
        }

        return prod - sum;
    }

    public static void main(String args[]){
        System.out.print(subtractProductAndSum(234));
    }
}
