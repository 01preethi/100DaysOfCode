package coreJava;
import java.util.Arrays;
public class ReorderedPowerof2 {
 public static void main(String[] args) {
	int n = 128;
	System.out.print(reorderedPowerOf2(n));
 }
 public static boolean reorderedPowerOf2(int n) {
     String Countn = digitCount(n);
     for(int i=0; i<30; i++){
          int pow = 1<<i;
	        if(digitCount(pow).equals(Countn))
	          return true;
     }
     return false;
  }
  private static String digitCount(int num){
  char[] arr = String.valueOf(num).toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

}
