//Problem Link-https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class MajorityElement {

    //Method-1 TC-O() Boyer-Moore Majority Vote Algorithm
    public int majorityElement1(int[] nums) {

        int ele=0;
        int count=0;

        for(int num:nums){
            if(count==0){
                ele=num;
            }
            count+=num==ele ? 1:-1;
        }
        return ele;

    }

    //Method-2 Tc-O(n) Hashing

    public int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key:nums){
            if(map.get(key)>Math.floor((double) nums.length /2)){
                return key;
            }
        }

        return -1;


    }



}
