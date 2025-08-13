package coreJava;
public class SumofPowOf3 {
  public static void main(String[] args) {
		int n = 12;
		System.out.print(checkPowersOfThree(n));
 }
  public static boolean checkPowersOfThree(int n) {
      while (n>0){
          if(n%3==2) return false;
          n/=3;
      }
     return true;
  }

}
