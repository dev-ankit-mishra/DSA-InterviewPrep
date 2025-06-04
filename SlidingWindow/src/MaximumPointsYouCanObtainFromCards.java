//Problem Link-https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0;
        int rsum=0;
        int tsum=0;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int maxSum=lsum;
        int i=k;
        for(int j=n-1;j>=n-k;j--){
            rsum+=cardPoints[j];
            lsum-=cardPoints[--i];
            tsum=lsum+rsum;
            maxSum=Math.max(maxSum,tsum);

        }
        return maxSum;

    }
}
