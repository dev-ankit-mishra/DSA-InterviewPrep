//Problem Link-https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

public class LongestConsecutiveSubSequence {

    //Tc-O(n)

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int max=0;
        for(int num: st){
            if(!st.contains(num-1)){
                int n=num;
                int currStreak=1;
                while(st.contains(n+1)){
                    currStreak++;
                    n++;
                }
                max=Math.max(max,currStreak);
            }
        }
        return max;
    }
}
