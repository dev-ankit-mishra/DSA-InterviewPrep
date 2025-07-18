//Problem Link-https://leetcode.com/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode head=q.poll();
                if(i==size-1){
                    ans.add(head.val);
                }
                if(head.left!=null) q.add(head.left);
                if(head.right!=null) q.add(head.right);

            }
        }

        return ans;

    }
}
