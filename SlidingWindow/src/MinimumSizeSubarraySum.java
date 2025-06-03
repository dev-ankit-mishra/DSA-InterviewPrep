//Problem Link-https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int size=Integer.MAX_VALUE;
        int sum=0;

        for(int j=0;j<n;j++){
            sum+=nums[j];

            while(sum>=target){
                size=Math.min(size,j-i+1);
                sum-=nums[i];
                i++;
            }
        }

        return size==Integer.MAX_VALUE ? 0 : size;
    }
}
