package coreJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Triangle {
	public static void main(String[] args) {
		 List<List<Integer>> triangle = new ArrayList<>();
	        triangle.add(Arrays.asList(2));
	        triangle.add(Arrays.asList(3, 4));
	        triangle.add(Arrays.asList(6, 5, 7));
	        triangle.add(Arrays.asList(4, 1, 8, 3));
	        int result = minimumTotal(triangle);
	        System.out.println("Minimum path sum: " + result);
	}
	public static int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];
        return helper(triangle,0,0,dp);
    }
	private static int helper(List<List<Integer>> triangle,int row,int col,Integer[][] dp){
		int n = triangle.size();
		if(row==n-1) return triangle.get(row).get(col);
		if(dp[row][col] != null) return dp[row][col];
		int down = triangle.get(row).get(col) + helper(triangle,row+1,col,dp);
		int downRight = triangle.get(row).get(col) + helper(triangle,row+1,col+1,dp);
		return dp[row][col] = Math.min(down, downRight);
	}
}
