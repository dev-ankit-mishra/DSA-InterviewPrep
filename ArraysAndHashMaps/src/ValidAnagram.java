//Problem Link-https://leetcode.com/problems/valid-anagram/description/


import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    //Method-1 TC-O(nlogn)
    public boolean isAnagram1(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);

        return Arrays.equals(sc,tc);

    }
    //Method-2 TC-O(n)
    public boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))==0){
                    return false;
                }else{
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }

            }else{
                return false;
            }
        }
        return true;
    }


}
