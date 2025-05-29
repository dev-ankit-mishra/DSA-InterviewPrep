//Problem Link-https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(map.containsKey(n)){
                if(Math.abs(map.get(n)-i)<=k){
                    return true;
                }
            }
            map.put(n,i);

        }
        return false;
    }
}
