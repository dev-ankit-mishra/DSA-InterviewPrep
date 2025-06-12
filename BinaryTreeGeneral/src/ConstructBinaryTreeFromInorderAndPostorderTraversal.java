//Problem Link-https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return helper(postorder,0,postorder.length-1,0,inorder.length-1);
    }

    public TreeNode helper(int[] postorder,int postLo,int postHi,int inLo,int inHi){

        if(postLo>postHi || inLo>inHi){
            return null;
        }
        TreeNode node=new TreeNode(postorder[postHi]);

        int idx=map.get(postorder[postHi]);
        int lst=idx-inLo;

        node.left=helper(postorder,postLo,postLo+lst-1,inLo,idx-1);
        node.right=helper(postorder,postLo+lst,postHi-1,idx+1,inHi);

        return node;
    }
}
