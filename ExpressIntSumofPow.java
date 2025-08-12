package coreJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ExpressIntSumofPow {
  private static final int Mod = 1000000007;
  private static int[][] memo;
 public static void main(String[] args) {
	 int n = 10, x = 2;
     System.out.print(numberOfWays(n,x));
 }
 public static int numberOfWays(int n, int x) {
     List<Integer> pow = new ArrayList<>();
     for(int i=1; Math.pow(i,x)<=n; i++){
         pow.add((int)Math.pow(i,x));
     }
     memo = new int[n+1][pow.size()];
     for(int[] r:memo) 
        Arrays.fill(r,-1);
     return dfs(pow,n,0);
 }
 private static int dfs(List<Integer> pow,int remain,int index){
     if(remain == 0) return 1;
     if(remain<0 || index>= pow.size()) return 0;
     if(memo[remain][index] != -1)
        return memo[remain][index];
     int take = dfs(pow,remain-pow.get(index),index+1);
     int skip = dfs(pow,remain,index+1);
     return memo[remain][index] = (int)((take+skip)%Mod);
 }

}
