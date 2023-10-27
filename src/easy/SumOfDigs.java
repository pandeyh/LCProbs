package easy;

//https://leetcode.com/problems/happy-number/
public class SumOfDigs {

    public static void main(String args[]){

        int n = 19;

        System.out.println(calc(n));

    }

    static boolean calc(int n){


        while (n > 0){
            double sum = Math.pow(n%10, 2)  + Math.pow(n/10,2);
            if((int) sum  == 1){

                return true;

            }
            else{
                return false;
            }

        }
        return false;
    }
}
