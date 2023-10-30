package easy;

//https://leetcode.com/problems/arranging-coins/description/
public class ArrangeCoins {

    public int arrangeCoins(int n) {

        int stairs = 0;
        int last = 0;

        int num = n;
        while(last < num){

            stairs++;
            last = stairs;

            num = num - last;
        }


        return stairs;
    }
}
