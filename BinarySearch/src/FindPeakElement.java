//Problem Link-https://leetcode.com/problems/find-peak-element/description/?envType=study-plan-v2&envId=top-interview-150

public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>nums[mid+1]){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }

        return hi;


    }

}
