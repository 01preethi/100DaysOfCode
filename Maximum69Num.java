package coreJava;
public class Maximum69Num {
 public static void main(String[] args) {
	int num = 9669;
	System.out.print(maximum69Number(num));
 }
 public static int maximum69Number (int num) {
     String s = String.valueOf(num);
     s = s.replaceFirst("6","9");
     return Integer.parseInt(s);
 }
}
