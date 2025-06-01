//Problem Link-https://leetcode.com/problems/3sum-closest/description/

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2];

        for(int k=0;k<n;k++){
            int i=k+1;
            int j=n-1;
            while(i<j){

                int sum=nums[i]+nums[j]+nums[k];

                if(Math.abs(sum-target)<Math.abs(target-closestSum)){
                    closestSum=sum;
                }

                if(sum<target){
                    i++;
                }else{
                    j--;
                }



            }
        }
        return closestSum;
    }
}
