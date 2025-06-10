//Problem Link-https://leetcode.com/problems/count-complete-tree-nodes/description/?envType=study-plan-v2&envId=top-interview-150

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left) + countNodes(root.right);
    }
}
