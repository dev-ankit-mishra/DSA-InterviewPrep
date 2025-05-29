//Problem Link-https://leetcode.com/problems/roman-to-integer/submissions/1648114253/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    //Method-1
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    //Method-2
    public int romanToInt2(String s) {
        Map<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i+1))>map.get(s.charAt(i))){
                sum-=map.get(s.charAt(i));
            }
            else{
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;

    }
}
