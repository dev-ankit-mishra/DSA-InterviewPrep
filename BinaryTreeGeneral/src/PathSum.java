//Problem Link-https://leetcode.com/problems/path-sum/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class PathSum {
    //Method-1
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;

        if(root.left==null && root.right==null){
            targetSum-=root.val;
            if(targetSum==0){
                return true;
            }
        }

        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }


}
