//Problem Link-https://leetcode.com/problems/average-of-levels-in-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);

        while(!q.isEmpty()){
            int size=q.size();

            double sum=0;
            int i=0;
            while(i<size){
                TreeNode head=q.poll();
                sum+=(double)head.val;
                if(head.left!=null) q.add(head.left);
                if(head.right!=null) q.add(head.right);
                i++;
            }

            ans.add((double)sum/i);


        }
        return ans;
    }
}
