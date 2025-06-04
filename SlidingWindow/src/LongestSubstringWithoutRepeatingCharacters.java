//Problem Link-https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int maxLen=0;
        int[] arr=new int[255];
        Arrays.fill(arr,-1);

        while(j<n){
            int ch=s.charAt(j);
            if(arr[ch]!=-1){
                if(arr[ch]>=i){
                    i=arr[ch]+1;
                }
            }
            maxLen=Math.max(maxLen,j-i+1);
            arr[ch]=j;
            j++;
        }
        return maxLen;
    }
}
