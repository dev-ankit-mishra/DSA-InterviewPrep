//Problem Link-https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        String[] str=s.split(" ");
        if(str.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){

            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }
            else{
                if(!map.containsValue(str[i])){
                    map.put(pattern.charAt(i),str[i]);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
