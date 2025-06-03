//Problem Link-https://leetcode.com/problems/permutation-in-string/description/

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;

        int[] s1Freq=new int[26];
        int[] s2Freq=new int[26];

        for(int i=0;i<n;i++){
            s1Freq[s1.charAt(i)-'a']++;
            s2Freq[s2.charAt(i)-'a']++;
        }

        if(matches(s1Freq,s2Freq)) return true;

        for(int i=n;i<m;i++){

            s2Freq[s2.charAt(i)-'a']++;
            s2Freq[s2.charAt(i-n)-'a']--;

            if(matches(s1Freq,s2Freq)) return true;

        }

        return false;
    }

    public boolean matches(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
