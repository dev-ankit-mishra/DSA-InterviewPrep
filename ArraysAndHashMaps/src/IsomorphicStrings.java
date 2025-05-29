//Problem Link-https://leetcode.com/problems/isomorphic-strings/submissions/1647896259/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;
import java.util.LinkedHashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!(map.get(s.charAt(i))==t.charAt(i))){
                    return false;
                }
            }else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }

        return true;




    }
}
