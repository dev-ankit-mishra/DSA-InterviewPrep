//Problem Link-https://leetcode.com/problems/basic-calculator/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int result=0;
        int n=s.length();
        int sign=1;
        int i=0;
        while(i<n){
            char c=s.charAt(i);

            if(Character.isDigit(c)){
                int num=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num=(num * 10) + (s.charAt(i)-'0');
                    i++;
                }
                result+=sign*num;
                continue;
            }

            else if(c=='+'){
                sign=1;
            }else if(c=='-'){
                sign=-1;
            }else if(c=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
            }else if(c==')'){
                result=st.pop()*result + st.pop();
            }




            i++;
        }
        return result;
    }
}
