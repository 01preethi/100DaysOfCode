package coreJava;
public class LenofLongestVshapedDiagonal {
 public static void main(String[] args) {
	 LenofLongestVshapedDiagonal sol = new LenofLongestVshapedDiagonal();
	 int[][] grid = {{2,2,1,2,2},{2,0,2,2,0},{2,0,1,1,0},{1,0,2,2,2},{2,0,0,2,2}};
	        int result = sol.lenOfVDiagonal(grid);
	        System.out.println("Length of Longest V-shaped Diagonal: " + result);
 }	
 private static final int[][] DIRS = {
         { 1, 1 }, //Bottom right
         { 1, -1 }, //Bottom left
         { -1, -1 }, //Top left
         { -1, 1 } //Top right
 };
 private int[][] grid;
 private int rows, cols;
 public int lenOfVDiagonal(int[][] grid) {
     this.grid = grid;
     this.rows = grid.length;
     this.cols = grid[0].length;
     int longest = 0;
     for(int i=0;i<rows;i++){
         for(int j=0;j<cols; j++){
             if(grid[i][j] == 1){
                 for(int dir = 0;dir < 4; dir++){
                     longest = Math.max(longest, dfs(i,j,dir, true,2) + 1);
                 }
             }
         }
     }
     return longest;
 }
 private int dfs(int x, int y, int dir, boolean canTurn, int target){
     int nx = x + DIRS[dir][0];
     int ny = y + DIRS[dir][1];
     //If out of bounds or value doesn't match target, stop here
     if(nx < 0 || ny < 0 || nx >= rows || ny >= cols || grid[nx][ny] != target){
         return 0;
     }
     //case 1: keep going straight in the same direction
     int maxSteps = dfs(nx,ny, dir, canTurn, 2- target);
     //case 2: Take one clockwise turn
     if(canTurn){
         int newDir = (dir + 1 ) % 4 ; //clockwise turn
         maxSteps = Math.max(maxSteps, dfs(nx, ny, newDir, false, 2 - target));
     }
     return maxSteps + 1;
 }
}
