package coreJava;
public class NumOfPeopleAwareofSecret {
  public static void main(String[] args) {
	  int n = 6, delay = 2, forget = 4;
	  System.out.print("number of people know the secret at the end of day is: "+peopleAwareOfSecret(n,delay,forget));  
  }
  public static int peopleAwareOfSecret(int n, int delay, int forget) {
      int MOD = 1000000007;
      long[] dp = new long[n+1];
      dp[1] = 1;
      for(int day=1;day<=n;day++){
          long share = dp[day];
          if(share==0) continue;
          for(int j=day+delay;j<day+forget&&j<=n;j++){
              dp[j] = (dp[j]+share)%MOD;
          }
      }
      long ans = 0;
      for(int i= n-forget+1;i<=n;i++){
          if(i>0) 
            ans = (ans+dp[i]) %MOD;
      }
      return (int)ans;
  }
}
