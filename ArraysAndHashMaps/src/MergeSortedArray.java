//Problem Link-https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

public class MergeSortedArray {

    //TC-O(n)

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                ans[k++]=nums2[j++];
            }else{
                ans[k++]=nums1[i++];
            }
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }
        for(int a=0;a<nums1.length;a++){
            nums1[a]=ans[a];
        }
    }

}
