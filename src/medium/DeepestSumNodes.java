package medium;

//https://leetcode.com/problems/deepest-leaves-sum/
public class DeepestSumNodes {

    public int deepestLeavesSum(TreeNode root) {

        if(root == null)
            return root.val;
        int level = 0;
        int[] maxDepth =  new int[1];
        int[] sumOfDeepestNodes = new int[1];
        int sum = 0;
         sumDeepestNodes(root, sumOfDeepestNodes, 1, maxDepth);
        return sumOfDeepestNodes[0];
    }

    public void sumDeepestNodes(TreeNode root, int[] sum , int currDepth, int[] maxDepth){
        if(root == null )
            return ;

        if(root.left == null && root.right == null )
        {
            if(maxDepth[0] == currDepth){
                sum[0] += root.val;
                return;
            }

            if(maxDepth[0] < currDepth){

                sum[0]= root.val;
                maxDepth[0] = currDepth;
                return;
            }

        }


        sumDeepestNodes(root.left , sum, currDepth+1, maxDepth);
        sumDeepestNodes(root.right, sum , currDepth +1, maxDepth);


        return;
    }

    public static void main(String args[])
    {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(5);
        n.left.left.left = new TreeNode(7);
        n.right = new TreeNode(3);
        n.right.right = new TreeNode(6);
        n.right.right = new TreeNode(8);

        int p = new DeepestSumNodes().deepestLeavesSum(n);
        System.out.print(p);
    }
}
