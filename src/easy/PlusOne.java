package easy;

import java.util.ArrayList;
// https://leetcode.com/problems/plus-one/


public class PlusOne {
        public int[] plusOne(int[] digits) {

            int carry = 0;
            boolean hasCarry = false;
            int sum = digits[digits.length-1] +1;
            ArrayList<Integer> nList = new ArrayList<>();
            //digits[digits.length-1]  = digits[digits.length-1] +1;
            if (sum >= 10 && sum %10 >= 0){
                ///int[] nDigits = new int[digits.length + 1];
                carry = sum / 10;
                for(int i=digits.length-1;i>=0 ;i --) {

                    if( i == digits.length-1){
                        //nDigits[nDigits.length -1] = sum%10;
                        nList.add(sum%10);
                    }else{
                        if(digits[i]+ carry >= 10){
                            //nDigits[i] = (digits[i]+ carry)%10;
                            nList.add( (digits[i]+ carry)%10);
                        }else{
                            //nDigits[i] = digits[i] + carry;
                            nList.add( (digits[i]+ carry));
                            carry =0;
                        }

                    }



                }
                if(carry > 0)
                    nList.add(carry);
               // nDigits[0] = nDigits[0]+carry;
                //return nList ;
                //nList.
                int[] nDigits = new int[nList.size()];
                int j = 0;
                for(int i=nList.size()-1; i>=0;i--){
                    nDigits[j] = nList.get(i);
                    j++;
                }

                return nDigits;
            }
            else{
                digits[digits.length-1] = sum;
                return digits;
            }





        }


        public static  void main(String args[]){
           int [] arr =  new PlusOne().plusOne(new int[]{1,2,3});
           for (int i=0;i< arr.length; i++)
            System.out.println(arr[i]);
        }
}
