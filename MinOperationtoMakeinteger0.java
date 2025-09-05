package coreJava;
public class MinOperationtoMakeinteger0 {
 public static void main(String[] args) {
	int num1 = 3, num2 = -2	;
	System.out.print(makeTheIntegerZero(num1,num2));
 }
 public static int makeTheIntegerZero(int num1, int num2) {
     for(int k=1;k<=60;k++){
         long target = (long)num1-(long)k*num2;
         if(target<0) continue;
         int b = Long.bitCount(target);
         if(b<=k && k<=target)
          return k;
     }
     return -1;
 }

}
