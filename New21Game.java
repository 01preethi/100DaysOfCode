package coreJava;
public class New21Game {
 public static void main(String[] args) {
	int n = 10, k = 1, maxPts = 10;
	System.out.print(new21Game(n,k,maxPts));

 }
 public static double new21Game(int n, int k, int maxPts) {
     if(k==0) return 1.0;
     double[] dp = new double[n+1];
     dp[0] = 1.0;
     double win = 1.0;
     for(int i=1; i<=n; i++){
         dp[i] = win/maxPts;
         if(i<k)
           win+=dp[i];
         if(i-maxPts>=0 && i-maxPts<k){
             win =win-dp[i-maxPts];
         }
     }
     double ans = 0.0;
     for(int i=k;i<=n; i++){
         ans+=dp[i];
     }
     return ans;
 }
}
