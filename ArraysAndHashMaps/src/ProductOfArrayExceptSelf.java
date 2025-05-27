//Problem Link-https://leetcode.com/problems/product-of-array-except-self/description/

public class ProductOfArrayExceptSelf {
    //Method-1 - TC-O(n)

    public int[] productExceptSelf1(int[] nums) {
        int[] ans=new int[nums.length];

        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]*prefix[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=nums[i]*suffix[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=suffix[i+1];
            }else if(i==nums.length-1){
                ans[i]=prefix[i-1];
            }
            else{
                ans[i]=prefix[i-1]*suffix[i+1];
            }
        }


        return ans;
    }

    //Method-2 TC-O(n)

    public int[] productExceptSelf2(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i]=nums[i-1]*pre[i-1];
        }
        int val=1;
        for(int i=n-2;i>=0;i--){
            val=val*nums[i+1];
            pre[i]=pre[i]*val;
        }
        return pre;
    }
}
