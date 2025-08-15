package coreJava;
public class PowOfFour {
 public static void main(String[] args) {
   int n = 16;
   System.out.print(isPowerOfFour(n));
 }
 public static boolean isPowerOfFour(int n) {
     if(n<=0) return false;
     while(n%4 == 0){
         n/=4;
     }
     return n==1;
     //return (n & (n - 1)) == 0 && n % 3 == 1; 
 }

}
