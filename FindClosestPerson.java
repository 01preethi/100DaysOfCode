package coreJava;
public class FindClosestPerson {
 public static void main(String[] args) {
	 int x = 2, y = 5, z = 6;
	 System.out.print(findClosest(x,y,z));
 }
 public static int findClosest(int x, int y, int z) {
     int a = Math.abs(x - z);
     int b = Math.abs(y - z);
     if (a<b) 
         return 1;
     else if (b<a)
         return 2;
     else
         return 0;
 }
}
