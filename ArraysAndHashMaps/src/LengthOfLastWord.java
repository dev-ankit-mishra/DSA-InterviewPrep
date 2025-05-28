//Problem Link-https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] str=s.trim().split("\\s+");
        return str[str.length-1].length();
    }
}
