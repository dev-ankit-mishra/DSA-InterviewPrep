//Problem Link-https://leetcode.com/problems/search-in-rotated-sorted-array/?envType=study-plan-v2&envId=top-interview-150

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<nums[0]){
                if(nums[n-1]>=target && nums[mid]<target){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }else{
                if(nums[lo]<=target && nums[mid]>target){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
        }

        return -1;
    }
}
