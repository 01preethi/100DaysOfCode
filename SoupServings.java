package coreJava;
public class SoupServings {
 public static void main(String[] args) {
	 int n = 50;
	 System.out.print(soupServings(n));
 }
 public static double soupServings(int N) {
     if (N >= 5000) return 1.0;
     int n = (N+24) / 25;
     double[][] dp = new double[n+1][n+1];
     for (int a=0; a<=n; a++) {
         for (int b=0; b<=n; b++) {
             if (a==0 && b==0) {
                 dp[a][b]=0.5;
             } else if (a==0) {
                 dp[a][b]=1.0;
             } else if (b==0) {
                 dp[a][b]=0.0;
             } else {
                 dp[a][b] = 0.25 * (get(dp, a-4, b)+
                     get(dp, a-3, b-1)+get(dp, a-2, b-2) +
                     get(dp, a-1, b-3)
                 );
             }
         }
     }
     return dp[n][n];
 }
 private static double get(double[][] dp, int a, int b) {
     if (a <= 0 && b <= 0) return 0.5;
     if (a <= 0) return 1.0;
     if (b <= 0) return 0.0;
     return dp[a][b];
 }
}
