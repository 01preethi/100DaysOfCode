package coreJava;
public class MinScoreTriangleofPolygon {
	public static void main(String[] args) {
		int[] values = {1,2,3};
		System.out.print("minimum possible score is: "+minScoreTriangulation(values));
	}
	private static int[][] memo;
    public static int minScoreTriangulation(int[] values) {
        int n = values.length;
        memo = new int[n][n];
        return solve(values,0,n-1);
    }
    private static int solve(int[] values,int i,int j){
        if(j-i<2) return 0;
        if(memo[i][j] != 0) return memo[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int left = solve(values,i,k);
            int right = solve(values,k,j);
            int triangle = values[i]*values[j]*values[k];
            ans = Math.min(ans, left+right+triangle);
        }
        return memo[i][j] = ans;
    }
}
