//Problem Link-https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;

public class TwoSum {
    //Method-1 TC-O(n^2)
    public int[] twoSum1(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }

    //Method-2 TC-O(n)
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)) {
                return new int[] { i, numToIndex.get(complement) };
            }

            numToIndex.put(nums[i], i);
        }

        // If no solution is found
        return new int[] {};
    }

}
