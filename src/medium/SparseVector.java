package medium;

//https://leetcode.com/problems/dot-product-of-two-sparse-vectors/description/
public class SparseVector {


        private int[] nums;

        SparseVector(int[] nums) {
            this.nums = nums;
        }

        // Return the dotProduct of two sparse vectors
        public int dotProduct(SparseVector vec) {

            int prod = 0;
            for(int i=0;i<vec.nums.length; i++){
                prod += vec.nums[i]*nums[i];
            }
            return prod;
        }


// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);

    public static void main(String args[]){
        int [] nums1 = {1,0,0,2,3}, nums2 = {0,3,0,4,0};
        SparseVector sp = new SparseVector(nums1);
        SparseVector sp2 = new SparseVector(nums2);

        int prod = sp.dotProduct(sp2);
        System.out.println(prod);

    }

}
