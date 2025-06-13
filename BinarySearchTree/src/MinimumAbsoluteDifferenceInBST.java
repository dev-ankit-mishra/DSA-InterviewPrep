//Problem Link-https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/?envType=study-plan-v2&envId=top-interview-150


import java.util.Stack;

public class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {

        Stack<TreeNode> st=new Stack<>();
        int mad=Integer.MAX_VALUE;
        TreeNode curr=root;
        Integer prev=null;

        while(curr!=null || !st.isEmpty()){

            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();

            if(prev!=null){
                mad=Math.min(mad,Math.abs(curr.val-prev));
            }

            prev=curr.val;


            curr=curr.right;

        }

        return mad;

    }
}
