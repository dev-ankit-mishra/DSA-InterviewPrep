//Problem Link-https://leetcode.com/problems/binary-tree-level-order-traversal/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();

        if(root!=null) q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode head=q.poll();
                list.add(head.val);
                if(head.left!=null) q.add(head.left);
                if(head.right!=null) q.add(head.right);

            }

            ans.add(list);


        }

        return ans;

    }
}
