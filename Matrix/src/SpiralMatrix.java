//Problem Link-https://leetcode.com/problems/spiral-matrix/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        List<Integer> list=new ArrayList<>();



        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);

                }
                left++;
            }

        }

        return list;
    }
}
