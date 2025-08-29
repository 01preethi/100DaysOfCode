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

#method-2
class FlowerGame {
    public long flowerGame(int n, int m) {
        // Formula: Alice wins when the sum (x + y) is odd
        // x even & y odd  OR  x odd & y even

        // Count how many odd and even numbers are in [1..n]
        long oddN = (n + 1) / 2;   // odd numbers up to n
        long evenN = n / 2;        // even numbers up to n

        // Count how many odd and even numbers are in [1..m]
        long oddM = (m + 1) / 2;   // odd numbers up to m
        long evenM = m / 2;        // even numbers up to m

        // Total winning ways:
        // (odd from n × even from m) + (even from n × odd from m)
        return oddN * evenM + evenN * oddM;
    }
}


