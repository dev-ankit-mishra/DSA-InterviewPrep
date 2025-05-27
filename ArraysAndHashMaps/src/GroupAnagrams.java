//Problem Link-https://leetcode.com/problems/group-anagrams/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    //TC-O(n * k*log*k)
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();

        for(String word: strs){
            char[] charArr=word.toCharArray();
            Arrays.sort(charArr);
            String str=new String(charArr);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());

            }
            map.get(str).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
