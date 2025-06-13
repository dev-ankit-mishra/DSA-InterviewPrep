//Problem Link-https://leetcode.com/problems/flatten-binary-tree-to-linked-list/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();

        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode curr=st.pop();

            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null)  st.push(curr.left);

            if(!st.isEmpty()){
                curr.right=st.peek();
            }
            curr.left=null;
        }

    }
}
