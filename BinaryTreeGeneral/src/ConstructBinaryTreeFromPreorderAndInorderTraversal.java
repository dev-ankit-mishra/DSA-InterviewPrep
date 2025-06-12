//Problem Link-https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,preorder.length-1,0,inorder.length-1);

    }

    public TreeNode helper(int[] preorder,int preLo,int preHi,int inLo,int inHi){

        if(preLo>preHi || inLo>inHi){
            return null;
        }

        TreeNode node=new TreeNode(preorder[preLo]);


        int idx=map.get(preorder[preLo]);
        int lts=idx-inLo;
        node.left=helper(preorder,preLo+1,preLo+lts,inLo,idx-1);
        node.right=helper(preorder,preLo+lts+1,preHi,idx+1,inHi);

        return node;
    }
}
