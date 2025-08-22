package coreJava;
public class MaximumareaCoverAll1s {
 public static void main(String[] args) {
	 int[][] grid = {{0,1,0},{1,0,1}};
	 System.out.print(minimumArea(grid));
 }
 public static int minimumArea(int[][] grid) {
     int row = grid.length;
     int col = grid[0].length;
     int minRow = row,maxRow =-1;
     int minCol = col,maxCol = -1;
     for(int i=0; i<row; i++){
         for(int j=0; j<col; j++){
             if(grid[i][j] == 1){
                 if(i<minRow) minRow = i;
                 if(i>maxRow) maxRow = i;
                 if(j<minCol) minCol = j;
                 if(j>maxCol) maxCol = j;

             }
         }
     }
     if(minRow == row && maxRow == 0 && minCol == col && maxCol == 0)
       return 0;
     int width = maxCol-minCol+1;
     int height = maxRow-minRow+1;
     return width*height;
 }
}
