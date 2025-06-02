//Problem Link-https://leetcode.com/problems/simplify-path/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] s = path.split("/");

        Stack<String> st = new Stack<>();

        for (String str : s) {
            str = str.trim();
            if (str.equals("") || str.equals("."))
                continue;
            if (str.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(str);
            }
        }

        StringBuilder ans=new StringBuilder();

        for(String str: st){
            ans.append("/").append(str);
        }

        return ans.length()==0 ? "/" : ans.toString();



    }
}
