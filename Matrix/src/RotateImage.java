//Problem Link-https://leetcode.com/problems/rotate-image/description/?envType=study-plan-v2&envId=top-interview-150

public class RotateImage {
    //Method-1

    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] copy=new int[r][];
        for(int i=0;i<r;i++){
            copy[i]=matrix[i].clone();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=copy[r-j-1][i];
            }
        }
    }

    //Method-2
    
}
