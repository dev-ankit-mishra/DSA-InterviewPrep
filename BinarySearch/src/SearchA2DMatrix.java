//Problem Link-https://leetcode.com/problems/search-a-2d-matrix/description/?envType=study-plan-v2&envId=top-interview-150

public class SearchA2DMatrix {
    //Method-1
    public boolean searchMatrix1(int[][] matrix, int target) {
        int n=matrix.length;
        int x=matrix[0].length;
        int lo=0;
        int hi=n-1;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(matrix[mid][0]<=target && target<=matrix[mid][x-1]){
                int i=0;
                int j=x-1;
                while(i<=j){
                    int m=i+(j-i)/2;

                    if(matrix[mid][m]==target) return true;
                    else if (matrix[mid][m]<target) i=m+1;
                    else j=m-1;
                }
                return false;
            }else if(target>matrix[mid][x-1]){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return false;
    }
    //Method-2
    public boolean searchMatrix2(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }

}
