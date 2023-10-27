package easy;

import java.util.HashSet;

//https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String a, String b) {

        char[] a1 = a.toCharArray();
        int i = a1.length-1;
        char[] b2 = b.toCharArray();
        int j = b2.length-1;
        String carry = "0";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> s = new HashSet<>();


        while(i >=0 && j>=0){

            // add 1s

            if(a1[i]== '1' && b2[j] == '1'){
                if(carry.equals("1")){
                    sb.append("1");
                    carry = "1";
                }
                else{
                    sb.append("0");
                    carry = "1";
                }



            }else if(a1[i]== '0' && b2[j] == '0'){
                if(carry.equals("1")){
                    sb.append("1");

                }
                else{
                    sb.append("0");

                }
                carry = "0";

            }else{
                sb.append("1");
                carry = "0";

            }

            i--;
            j--;

        }

        if(j <0 ) {
            while(i >=0){
                if(carry.equals("1") && a1[i] == '1'){
                    sb.append("0");
                    carry = "1";
                }
                else  {
                    if (carry.equals("1")){
                        sb.append(carry);
                    }
                    else{
                        sb.append(a1[i]);
                    }
                    carry = "0";
                }
                i--;
            }
        }else{
            while(j >=0){
                if(carry.equals("1") && b2[j] == '1'){
                    sb.append("0");
                    carry = "1";
                }
                else  {
                    if (carry.equals("1")){
                        sb.append(carry);
                    }
                    else{
                        sb.append(b2[j]);
                    }
                }
                j--;
            }
        }

        if(carry.equals("1")){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String args[]){

        String a = "101111";
        String b = "10";
        String s = new AddBinary().addBinary(a,b);
        System.out.println("-- " + s);
    }
}
