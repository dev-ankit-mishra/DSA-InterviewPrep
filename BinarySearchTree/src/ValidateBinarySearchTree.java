//Problem Link-https://leetcode.com/problems/validate-binary-search-tree/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class ValidateBinarySearchTree {

    //Method-1
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) return false;

        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }

    //Methode-2

    public boolean isValidBST2(TreeNode root) {

        Stack<TreeNode> st = new Stack<>();
        long prev = Long.MIN_VALUE;
        TreeNode curr = root;
        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();

            if (prev >= curr.val) {
                return false;
            }

            prev = curr.val;

            curr = curr.right;
        }
        return true;
    }
}
