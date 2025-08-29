package coreJava;
public class FlowerGame {
  public static void main(String[] args) {
	  int n = 3, m = 2;
	  System.out.print(flowerGame(n,m));
  }
  public static long flowerGame(int n, int m) {
      // Total pairs = n * m
      // Alice wins in exactly half of them (when sum is odd)
      // So answer = n * m / 2
      // Cast to long to prevent overflow for large inputs
      return (long) n * m / 2;
  }
}
