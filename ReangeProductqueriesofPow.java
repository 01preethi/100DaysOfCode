package coreJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ReangeProductqueriesofPow {
 private static final int MOD = 1000000007;
 public static void main(String[] args) {
	 int n = 15;
	 int[][] queries = {{0,1},{2,2},{0,3}};
	 int[] result = productQueries(n, queries);
     System.out.println("Output:"+Arrays.toString(result));
 }
 public static int[] productQueries(int n, int[][] queries) {
     List<Integer> pow = new ArrayList<>();
     for(int i=0; i<32; i++){
         if((n&(1<<i)) != 0)
            pow.add(1<<i);
     }
     int[] ans = new int[queries.length];
     int k = 0;
     for(int[] query:queries){
         int start = query[0];
         int end = query[1];
         long p = 1;
         for(int i=start;i<=end;i++){
             p = (p*pow.get(i))%MOD;
         }
         ans[k++] = (int)p;
     }
     return ans;
 }

}
