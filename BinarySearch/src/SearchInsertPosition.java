//Problem Link-https://leetcode.com/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-interview-150

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        if(nums[lo]>target) return 0;

        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return lo;
    }
}
