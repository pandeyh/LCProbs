package easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        Object[] arr = a.toArray();
        for(int i=0;i<arr.length/2;i++){

            int temp = (int)arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        return a;
    }

    public static void main(String args[]){
        ArrayList<Integer>a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = reverseArray(a);

        System.out.print("b is ---" + b);

    }
}
