//Problem Link-https://leetcode.com/problems/binary-search-tree-iterator/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> st;

    private void pushAll(TreeNode node){
        while(node!=null){
            st.push(node);
            node=node.left;
        }
    }

    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        pushAll(root);

    }

    public int next() {
        TreeNode curr=st.pop();

        if(curr.right!=null){
            pushAll(curr.right);
        }

        return curr.val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }
}
