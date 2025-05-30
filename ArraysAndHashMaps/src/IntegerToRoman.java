//Problem Link-https://leetcode.com/problems/integer-to-roman/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;

public class IntegerToRoman {
    class Pair {
        String c;
        int val;
        Pair(String c, int val) {
            this.c = c;
            this.val = val;
        }
    }

    public String intToRoman(int num) {
        ArrayList<Pair> list = new ArrayList<>();
        list.add(new Pair("M", 1000));
        list.add(new Pair("CM", 900));
        list.add(new Pair("D", 500));
        list.add(new Pair("CD", 400));
        list.add(new Pair("C", 100));
        list.add(new Pair("XC", 90));
        list.add(new Pair("L", 50));
        list.add(new Pair("XL", 40));
        list.add(new Pair("X", 10));
        list.add(new Pair("IX", 9));
        list.add(new Pair("V",5));
        list.add(new Pair("IV", 4));
        list.add(new Pair("I", 1));

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            int t = num / list.get(i).val;  // how many times this symbol fits
            if (t > 0) {
                str.append(list.get(i).c.repeat(t));
                num -= t * list.get(i).val;  // reduce the number
            }
        }

        return str.toString();
    }

}
