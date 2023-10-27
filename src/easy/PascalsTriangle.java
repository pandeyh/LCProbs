package easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/description/
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> main = new ArrayList<>();
        List<Integer> first = new ArrayList<Integer>();

        first.add(1); // Add 1 for the first row
        main.add(first);
        for(int i=1;i<numRows; i++){

            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prev =     main.get(i-1);
            row.add(1); // add first element

            for(int j=1;j<i;j++){
                row.add(prev.get(j-1) + prev.get(j));
            }
            row.add(1); //add 1 as last element
            main.add(row);
        }
        return main;
    }

    public static void main(String args[]) {

        List<List<Integer>> result = new PascalsTriangle().generate(5);
        System.out.println(result);
    }

}
