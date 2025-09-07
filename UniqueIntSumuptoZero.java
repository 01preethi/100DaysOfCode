package coreJava;
import java.util.Arrays;
public class UniqueIntSumuptoZero {
 public static void main(String[] args) {
	int n = 5;
	int[] res = sumZero(n);
	System.out.print(Arrays.toString(res));
 }
 public static int[] sumZero(int n) {
     int[] res = new int[n];
     res[0] = -((n)*(n-1))/2;
     for(int i=1;i<n;i++){
      res[i] = i;
     }
     return res; 
  }
}
