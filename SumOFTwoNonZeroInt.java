package coreJava;
import java.util.Arrays;
public class SumOFTwoNonZeroInt {
 public static void main(String[] args) {
	int n = 5;
	int[] res = getNoZeroIntegers(n);
	System.out.println(Arrays.toString(res));
 }
 public static int[] getNoZeroIntegers(int n) {
     for(int a=1; a<n; a++){
         int b = n-a;
         if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")){
             return new int[] {a,b};
         }
     }
     return new int[] {};
 }
}

method - 2
//public class SumOFTwoNonZeroInt {
//	 public static void main(String[] args) {
//		int n = 5;
//		int[] res = getNoZeroIntegers(n);
//		System.out.println(Arrays.toString(res));
//	 }
// public static int[] getNoZeroIntegers2(int n) {
//	 for(int a=1; a<n; a++){
//         int b = n-a;
//         if(hasZero(a) && hasZero(b)){
//             return new int[] {a,b};
//         }
//     }
//     return new int[] {};
// }
// private static boolean hasZero(int x){
//     while(x>0){
//         if(x%10 ==0) return false;
//         x/=10;
//     }
//     return true;
// }
//}
