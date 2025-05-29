//Problem Link-https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<numRows;i++){

            for(int j=i;j<s.length();j+=2*(numRows-1)){
                str.append(s.charAt(j));

                if(i!=0 && i!=numRows-1 && s.length()>(j+2*(numRows-1)-2*(i))){
                    str.append(s.charAt(j+2*(numRows-1)-2*(i)));
                }

            }
        }
        return str.toString();
    }
}
