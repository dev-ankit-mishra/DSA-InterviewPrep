//ProblemLink-https://leetcode.com/problems/trapping-rain-water/?envType=study-plan-v2&envId=top-interview-150

public class TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;
        int[] preMax=new int[n];
        int[] suffMax=new int[n];

        preMax[0]=height[0];
        suffMax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            preMax[i]=Math.max(preMax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffMax[i]=Math.max(suffMax[i+1],height[i]);
        }

        int total=0;

        for(int i=0;i<n;i++){
            int leftMax=preMax[i];
            int rightMax=suffMax[i];

            if(height[i]<leftMax && height[i]<rightMax){
                total+=Math.min(leftMax,rightMax)-height[i];
            }
        }

        return total;

    }
}
