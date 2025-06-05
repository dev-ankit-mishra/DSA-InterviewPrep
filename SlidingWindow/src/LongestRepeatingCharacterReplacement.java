//Problem Link-https://leetcode.com/problems/longest-repeating-character-replacement/description/

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        int i = 0;
        int[] arr = new int[26];
        int maxFreq = 0;

        for (int j = 0; j < n; j++) {
            arr[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(j) - 'A']);

            int changes = (j - i + 1) - maxFreq;
            if (changes > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
