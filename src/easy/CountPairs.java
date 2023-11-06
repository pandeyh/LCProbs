package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class CountPairs {

    // One way to solve this. This takes 3ms ( leetcode calculation) to solve the problem
    public int countPairsBySort(List<Integer> nums, int target) {
        Collections.sort(nums);

        int len = nums.size();

        int left = 0;
        int right = len - 1;

        int count = 0;
        while(left < right){
            int sum = nums.get(left) + nums.get(right);

            if(sum < target){
                count += right - left;
                left ++;
            }
            else{
                right--;
            }
        }

        return count;

    }

    // Little better in run time 2 ms (leetcode calculation)
    public int countPairs(List<Integer> nums, int target) {

        int count = 0;
        for(int i=0;i<nums.size(); i++){
            for (int j=i+1; j <nums.size(); j++){

                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;

    }


    public static void main(String args[]){

        CountPairs cp = new CountPairs();
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(-1);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(1);
        int n = cp.countPairs(lst, 2);
        System.out.println(n);
    }

}
