//Problem Link-https://leetcode.com/problems/game-of-life/description/?envType=study-plan-v2&envId=top-interview-150

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int[][] copy = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            copy[i] = board[i].clone(); // Clone each row
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    if (neighbours(copy, i, j) < 2) {
                        board[i][j] = 0;
                    } else if (neighbours(copy, i, j) == 2 || neighbours(copy, i,j) == 3) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 0;
                    }
                } else {
                    if (neighbours(copy, i, j) == 3) {
                        board[i][j] = 1;
                    }

                }
            }
        }
    }

    public int neighbours(int[][] arr, int i, int j) {
        int r = arr.length;
        int c = arr[0].length;
        int count = 0;
        if (i > 0 && arr[i - 1][j] == 1)
            count++;
        if (i > 0 && j > 0 && arr[i - 1][j - 1] == 1)
            count++;
        if (i > 0 && j < c - 1 && arr[i - 1][j + 1] == 1)
            count++;
        if (j > 0 && arr[i][j - 1] == 1)
            count++;
        if (j < c - 1 && arr[i][j + 1] == 1)
            count++;
        if (i < r - 1 && j > 0 && arr[i + 1][j - 1] == 1)
            count++;
        if (i < r - 1 && arr[i + 1][j] == 1)
            count++;
        if (i < r - 1 && j < c - 1 && arr[i + 1][j + 1] == 1)
            count++;

        return count;

    }
}
