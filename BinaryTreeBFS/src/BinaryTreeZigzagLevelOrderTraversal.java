//Problem Link-https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode head=q.poll();
                arr.add(head.val);
                if(head.left!=null) q.add(head.left);
                if(head.right!=null) q.add(head.right);
            }
            if(!flag){
                Collections.reverse(arr);
            }
            ans.add(arr);
            flag=!flag;
        }
        return ans;
    }
}
