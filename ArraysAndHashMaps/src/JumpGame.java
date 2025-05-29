//Problem Link-https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150

public class JumpGame {
    public boolean canJump(int[] nums) {
        int des=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=des){
                des=i;
            }
        }
        return des==0;


    }

    //Method-2

    public boolean canJump2(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<i){
                return false;
            }
            else if((nums[i]+i)>max){
                max=nums[i]+i;
            }
        }
        return true;

    }
}
