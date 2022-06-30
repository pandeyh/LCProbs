package easy;

//https://leetcode.com/problems/range-sum-of-bst/

import medium.TreeNode;

public class RangeSumBST {

    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {

        if(root == null) return 0;

        if(root.val >= low && root.val <= high)
        {
            sum += root.val;
        }

        if(root.left != null )
            rangeSumBST(root.left, low, high);
        if(root.right != null )
            rangeSumBST(root.right, low, high);

        return sum;
    }

}
