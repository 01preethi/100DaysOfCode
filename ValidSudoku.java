package coreJava;
import java.util.HashSet;
public class ValidSudoku {
 public static void main(String[] args) {
	char[][] board = 
		{   {'5','3','4','.','7','.','.','.','8'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'1','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','4','.','.','8','6','.','7','9'}};
    System.out.println("Is the Sudoku board valid? " + isValidSudoku(board));
 }
 public static boolean isValidSudoku(char[][] board) {
     HashSet<String> seen = new HashSet<>();
     for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
             char c = board[i][j];
             if(c == '.') continue;
             String rowKey = c+"in row"+i;
             String colKey = c+"in col"+j;
             String boxKey = c+"in box"+(i/3)+"."+(j/3);
             if(!seen.add(rowKey)||!seen.add(colKey)||!seen.add(boxKey)) 
                return false;
         }
     }
     return true;
 }

}
