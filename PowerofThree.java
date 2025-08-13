package coreJava;
public class PowerofThree {
	public static void main(String[] args) {
		int n = 27;
		System.out.print(isPowerOfThree(n));
 }
  public static boolean isPowerOfThree(int n) {
      if(n<1) return false;
      while(n%3 == 0){
          n=n/3;
      }
      return n==1;
  }
}

