package hard;

// Merge two sorted arrays
class MergeArrays {


    public  static int[] mergeArrays(int[] nums1, int[] nums2) {


        int i=0 ,j=0;
        int[] nums = new int[nums1.length + nums2.length];
        int k = 0;
        while(i<nums1.length && j<nums2.length){

            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i++;
            }
            else{
                nums[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i<nums1.length)
        {
            nums[k] = nums1[i];
            i++;
            k++;
        }

        while(j<nums2.length)
        {
            nums[k] = nums2[j];
            j++;
            k++;
        }

        return nums;
    }

    public static void main(String args[]){
        int [] a = {1,2};
        int [] b = {3,4};

        int []c = mergeArrays(a,b);

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
    }
}