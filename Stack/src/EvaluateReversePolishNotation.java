//Problem Link-https://leetcode.com/problems/evaluate-reverse-polish-notation/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st=new ArrayDeque<>();

        for(String token:tokens){
            switch(token){
                case "+" -> st.push(st.pop()+st.pop());
                case "-" -> st.push(-st.pop()+st.pop());
                case "*" -> st.push(st.pop()*st.pop());
                case "/" ->{
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b/a);
                }
                default->st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

}

