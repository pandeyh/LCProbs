package medium;

import java.util.ArrayList;

public class BuildingsWithOceanView {



    public int[] findBuildings(int[] heights) {

        ArrayList<Integer> lst = new ArrayList<>();
        int maxBuildingHeight = 0;
        for (int i = heights.length - 1; i >= 0; i--){
             if(heights[i] > maxBuildingHeight){
                 maxBuildingHeight = heights[i];
                 lst.add(i);
             }
        }


        int[] intArray = new int[lst.size()];
        int k =lst.size()-1;
        int j=0;
        while(k >=0){
            intArray[j] = lst.get(k);
            j++;
            k--;
        }

        return intArray;
    }

    public static void main(String args[])
    {
        int[] n = {4,2,3,1};
        int[] s = new BuildingsWithOceanView().findBuildings(n);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i] + ",");
        }

    }
}
