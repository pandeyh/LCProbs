package easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/description/
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<String>();

        int i=1;
        while( i <= n ){
            if(i %3 == 0 || i %5 == 0)
            {
                if(i %3 == 0 && i %5 == 0){
                    result.add("FizzBuzz");
                }else  if(i%3 == 0){
                    result.add("Fizz");
                }else{
                    result.add("Buzz");
                }

            }
            else{
                result.add(String.valueOf(i));
            }
            i++;

        }

        return result;
    }

}
