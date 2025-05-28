//Problem Link-https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

public class RemoveDuplicatesFromSortedArray {
    //TC-O(n)
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}
