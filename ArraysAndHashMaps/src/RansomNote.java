//Problem Link-https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freq = new HashMap<>();

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!freq.containsKey(c) || freq.get(c) == 0) {
                return false;
            }
            freq.put(c, freq.get(c) - 1);
        }

        return true;
    }
}
