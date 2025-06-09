//Problem Link-https://leetcode.com/problems/same-tree/description/?envType=study-plan-v2&envId=top-interview-150

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        else if(!isSameTree(p.left, q.left)) return false;

        else return isSameTree(p.right, q.right);

    }
}
