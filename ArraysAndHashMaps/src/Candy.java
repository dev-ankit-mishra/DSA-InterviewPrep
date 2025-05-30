//Problem Link-https://leetcode.com/problems/candy/description/?envType=study-plan-v2&envId=top-interview-150



public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==1){
            return 1;
        }
        int[] left=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i]<=ratings[i-1]){
                left[i]=1;
            }else{
                left[i]=left[i-1]+1;
            }
        }
        int[] right=new int[n];
        right[n-1]=1;

        for(int i=n-2;i>=0;i--){
            if(ratings[i]<=ratings[i+1]){
                right[i]=1;
            }else{
                right[i]=right[i+1]+1;
            }
        }


        int sum=0;
        for(int i=0;i<left.length;i++){
            sum+=Math.max(left[i],right[i]);
        }
        return sum;
    }
}
