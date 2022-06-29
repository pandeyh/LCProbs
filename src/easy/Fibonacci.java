package easy;

//https://leetcode.com/problems/fibonacci-number/
public class Fibonacci {

    /**
     *  First methor using Recurssion
     * @param n
     * @return
     */
    public int fib_recurssion(int n) {

        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return fib_recurssion(n - 1) + fib_recurssion(n - 2);
    }

    /**
     * Using for-loop
     * @param n
     * @return
     */
    public int fib(int n) {

        if(n == 0 || n == 1) {
            return n;
        }

        int[] fibo = new int[n +1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo[n];
    }

    public static void main(String args[]){

        int n = new Fibonacci().fib(4);

        System.out.print(n);
    }
}
