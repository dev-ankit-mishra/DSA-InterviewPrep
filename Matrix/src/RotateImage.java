//Problem Link-https://leetcode.com/problems/rotate-image/description/?envType=study-plan-v2&envId=top-interview-150

public class RotateImage {
    //Method-1

    public void rotate1(int[][] matrix) {
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

    public void rotate2(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        //transpose
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse
        for(int i=0;i<r;i++){
            for(int j=0;j<c/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][c-j-1];
                matrix[i][c-j-1]=temp;
            }
        }

    }

}
