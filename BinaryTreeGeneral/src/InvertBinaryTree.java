//Problem Link-https://leetcode.com/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode temp=invertTree(root.left);
        root.left=invertTree(root.right);
        root.right=temp;


        return root;
    }
}
