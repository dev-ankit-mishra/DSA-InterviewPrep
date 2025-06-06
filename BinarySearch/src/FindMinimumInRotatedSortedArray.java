//Problem Link-https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        if(nums[lo]<nums[hi]){
            return nums[lo];
        }

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[0]<=nums[mid]){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }
        return nums[lo];
    }
}
