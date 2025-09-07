package coreJava;
public class MaxOperationstoMakeArr0 {
 public static void main(String[] args) {
	int[][] queries = {{1,2},{2,4}};
	System.out.print(minOperations(queries));
 }
 public static long minOperations(int[][] queries) {
     long res = 0;
     for(int[] q:queries){
         int l=q[0];
         int r=q[1];
         long steps = helper(l,r);
         res = res+(steps+1)/2;
     }
     return res;
 }
 private static long helper(int l,int r){
     long L = 1;
     long s = 1;
     long steps =0; 
     while(L<=r){
         long R = 4*L-1;
         long start = Math.max(l,L);
         long end = Math.min(r,R);
         if(start<=end){
             steps+=(end-start+1)*s;
         }
         s++;
         L*=4;
     }
     return steps;
 }
}
