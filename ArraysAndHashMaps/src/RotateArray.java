//Problem Link-https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k);
        reverse(nums,n-k,n);
        reverse(nums,0,n);

    }
    public void reverse(int[] arr,int i,int j){
        int lo=i;
        int hi=j-1;
        while(lo<hi){
            int temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo++;
            hi--;
        }
    }
}
