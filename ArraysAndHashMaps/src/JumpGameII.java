//Problem Link-https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150

public class JumpGameII {
    public int jump(int[] nums) {
        int n=nums.length;
        int jumps=0;
        int l=0;
        int r=0;
        while(r<n-1){
            int far=0;
            for(int i=l;i<=r;i++){
                far=Math.max(far,nums[i]+i);
            }
            l=r+1;
            r=far;
            jumps++;
        }
        return jumps;


    }
}
