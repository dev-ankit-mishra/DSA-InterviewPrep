//Problem Link-https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> st=new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='('){
                st.push(')');
            }else if(c=='{'){
                st.push('}');
            }else if(c=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=c){
                return false;
            }

        }

        return st.isEmpty();


    }
}
