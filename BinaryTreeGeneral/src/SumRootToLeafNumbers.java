//Problem Link-https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class SumRootToLeafNumbers {
    //Method-1
    class Pair{
        TreeNode top;
        int num;
        Pair(TreeNode top,int num){
            this.top=top;
            this.num=num;
        }
    }
    public int sumNumbers(TreeNode root) {
        Stack<Pair> st=new Stack<>();
        if(root!=null) st.push(new Pair(root,root.val));

        int sum=0;
        while(!st.isEmpty()){
            Pair pair=st.pop();
            TreeNode top=pair.top;
            int num=pair.num;

            if(top.left==null && top.right==null){
                sum+=num;
            }
            if(top.right!=null){
                st.push(new Pair(top.right,num*10+top.right.val));
            }
            if(top.left!=null){
                st.push(new Pair(top.left,num*10+top.left.val));
            }
        }
        return sum;
    }

    //Method-2
    public int sumNumbers2(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=sum*10+root.val;

        if(root.left==null && root.right==null){
            return sum;
        }
        return dfs(root.left,sum) + dfs(root.right,sum);

    }

}
