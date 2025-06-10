//Problem Link-https://leetcode.com/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-interview-150

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;

        return isSameTree(invertTree(root.left),root.right);
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;

    }
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }

        TreeNode temp=invertTree(root.left);
        root.left=invertTree(root.right);
        root.right=temp;

        return root;
    }
}
