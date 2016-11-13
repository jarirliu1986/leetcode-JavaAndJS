import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null)
            throw new NullPointerException();
        HashMap<Character, Integer> row = new HashMap<>(9), col = new HashMap<>(9);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch1 = board[i][j], ch2 = board[j][i];
                if (ch1 != '.') {
                    if (row.containsKey(ch1)) return false;
                     else row.put(ch1, 1);
                }
                if (ch2 != '.') {
                    if (col.containsKey(ch2)) return false;
                    else col.put(ch2, 1);
                }
            }
            row.clear();
            col.clear();
        }
        HashMap<Character, Integer> sudoku = new HashMap<>(9);
        for (int r = 0; r <= 6; r+=3) {
            for (int c = 0; c <= 6; c+=3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char ch = board[i+r][j+c];
                        if (ch != '.') {
                            if (sudoku.containsKey(ch)) return false;
                            else sudoku.put(ch, 1);
                        }
                    }
                }
                sudoku.clear();
            }
        }
        return true;
    }
}
