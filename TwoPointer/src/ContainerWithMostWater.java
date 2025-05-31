//Problem Link-https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max=-1;

        while(i<j){
            int l=j-i;
            int b= Math.min(height[i], height[j]);
            int a=l*b;
            if(a>max){
                max=a;
            }
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
