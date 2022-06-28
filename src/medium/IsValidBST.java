package medium;

// https://leetcode.com/problems/validate-binary-search-tree

public class IsValidBST {


    public boolean isValidBST(TreeNode root)
    {
        // can use Integer.Min and Integer.Max too but leetcode tests uses a higher range 
        return isBST2(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }
    private boolean isBST2(TreeNode root, long min, long max)
    {
        if(root == null)
            return true;
        else
        {
            if(root.val < min || root.val > max)
            {
                return false;
            }
            else
                return isBST2(root.left, min, root.val) && isBST2(root.right, root.val+1, max);
        }
    }

    public static void main(String args[]){

        TreeNode n = new TreeNode(5);
        n.left = new TreeNode(4);
        n.right = new TreeNode(6);
        n.right.left = new TreeNode(3);
        n.right.right = new TreeNode(7);

        boolean isValid = new IsValidBST().isValidBST(n);
        System.out.print(isValid);
    }
}
