//Problem Link-https://leetcode.com/problems/longest-repeating-character-replacement/description/

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        int i = 0;
        int[] arr = new int[26];
        int maxFreq = 0;

        for (int j = 0; j < n; j++) {
            int i1 = arr[s.charAt(j) - 'A'];
            i1++;
            maxFreq = Math.max(maxFreq, i1);

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
