package medium;

//https://leetcode.com/problems/insert-into-a-binary-search-tree/
public class InsertToBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null)
            return new TreeNode( val);;

        if(val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right =  insertIntoBST(root.right, val);

        return root;

    }

    public static void main(String args[]){

        TreeNode n = new TreeNode(4);
        n.left = new TreeNode(2);
        n.right = new TreeNode(7);
        n.right.left = new TreeNode(1);
        n.right.right = new TreeNode(3);

        TreeNode node = new InsertToBST().insertIntoBST(n,5);
        System.out.print(node.val);
    }
}
