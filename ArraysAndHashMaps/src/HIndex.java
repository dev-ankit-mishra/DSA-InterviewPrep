//Problem Link-https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150

public class HIndex {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] arr=new int[n+1];

        for(int i=0;i<n;i++){
            if(citations[i]<n){
                arr[citations[i]]++;
            }else{
                arr[n]++;
            }
        }

        int p=0;

        for(int i=arr.length-1;i>=0;i--){
            p+=arr[i];
            if(p>=i){
                return i;
            }

        }
        return 0;
    }
}
