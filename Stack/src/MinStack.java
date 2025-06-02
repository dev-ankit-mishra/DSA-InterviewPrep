//Problem Link-https://leetcode.com/problems/min-stack/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();

    }

    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
    }

    public void pop() {
        int x=st.pop();
        if(minStack.peek()==x){
            minStack.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
