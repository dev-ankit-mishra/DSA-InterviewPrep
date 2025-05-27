//Problem Link-https://leetcode.com/problems/top-k-frequent-elements/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TopKFrequentElements {

    //Method 1-TC-O(n log n)

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];

        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));


        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();
        }
        return arr;

    }
}
