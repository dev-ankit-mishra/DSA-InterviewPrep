//Problem Link-https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //Method-1-  TC-O(n)
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> st=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])){
                return true;
            }else{
                st.add(nums[i]);
            }
        }
        return false;
    }

    //Method-2- TC-O(nlogn)
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }

}


