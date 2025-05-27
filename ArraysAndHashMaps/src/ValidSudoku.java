//Problem link-https://leetcode.com/problems/valid-sudoku/description/

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    //Tc-O(9) -constant


    public boolean isValidSudoku(char[][] board) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (rowSet.contains(c)) return false;
                    rowSet.add(c);
                }
            }
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            Set<Character> colSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c != '.') {
                    if (colSet.contains(c)) return false;
                    colSet.add(c);
                }
            }
        }

        // Check each 3x3 subgrid
        for (int m = 0; m < 9; m += 3) {
            for (int n = 0; n < 9; n += 3) {
                Set<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[m + i][n + j];
                        if (c != '.') {
                            if (boxSet.contains(c)) return false;
                            boxSet.add(c);
                        }
                    }
                }
            }
        }

        return true;
    }
}
