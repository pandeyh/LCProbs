package easy;

public class RemoveDuplicatesFromArray {

    public int removeDuplicates(int[] nums) {

        int count =0;
        for(int i=1;i<nums.length;i++){

            if(nums[count] != nums[i]){
                count++;
                nums[count] = nums[i];

            }
            else{
                continue;
            }

        }

        return count+1;

    }

    public static void main(String args[]){
        int[] a = {1,1,2};
        int k = new RemoveDuplicatesFromArray().removeDuplicates(a);
        System.out.println(k);
    }
}
