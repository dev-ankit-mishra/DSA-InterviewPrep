//Problem Link-https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    //TC-O(n)
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }

        return count;
    }
}
