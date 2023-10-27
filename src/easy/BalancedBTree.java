package easy;

import medium.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/submissions/
public class BalancedBTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

        public boolean isBalanced(TreeNode root) {

            if (root == null)
                return true;

            if(Math.abs(height(root.left) - height(root.right)) > 1)
                return false;

            return  isBalanced(root.left) && isBalanced(root.right);


        }


        public int height(TreeNode node ) {

            if(node == null )
                return 0;

            return 1+ Math.max( height(node.right) , height(node.left));


        }

}
