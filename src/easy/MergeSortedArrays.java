package easy;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArrays {

    public static void main(String args[]) {

        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};

        new MergeSortedArrays().merge(nums1, 3, nums2, 3);
    }


    public void merge(int nums1[], int m, int nums2[], int n){

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        System.out.print("merged");
    }

    // this doesn't work

    public void merge_bad(int nums1[], int m, int nums2[], int n){
        int k = 0;
        int l = 0;


        for(int i=0;i<m+n;){

            for(int j=k;j<n;j++) {

                if(nums1[i] > nums2[j]){

                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums1[i+1] = temp;
                    k++;
                }
                else{
                    i++;
                    break;
                }
            }

        }

        for(int i=k;i<n;i++)
        {
            nums1[m+n-i]= nums2[n-i];

        }

    }

}
