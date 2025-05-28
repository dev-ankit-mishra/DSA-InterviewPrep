//Problem Link-https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=top-interview-150

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] arr=s.split("\\s+");
        String str="";
        for(int i=arr.length-1;i>=0;i--){
            str+=arr[i];
            str+=" ";
        }
        return str.trim();

    }
}
