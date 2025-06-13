//Problem Link-https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-interview-150


import java.util.Stack;

public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st=new Stack<>();

        TreeNode curr=root;

        while(curr!=null || !st.isEmpty()){

            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }

            curr=st.pop();
            if(k==1){
                return curr.val;
            }
            k--;

            curr=curr.right;
        }
        return -1;
    }
}
