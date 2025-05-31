//Problem Link-https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150

public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        int i=0;
        int j=n-1;
        while(i<j){
            if((numbers[i]+numbers[j])==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }else if((numbers[i]+numbers[j])>target){
                j--;
            }else{
                i++;
            }
        }
        return  arr;
    }
}
