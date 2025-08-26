package coreJava;
public class MaxAreaOfLongestDiagonalrec {
 public static void main(String[] args) {
	 int[][] dimensions = {{9,3},{8,6}};
	 System.out.print("area of the rectangle having the longest diagonal is: "+areaOfMaxDiagonal(dimensions));
 }
 public static int areaOfMaxDiagonal(int[][] dimensions) {
     int maxDiagonal = 0;
     int maxarea = 0;
     for(int[] rec : dimensions){
         int l = rec[0];
         int w = rec[1];
         int diagonal = l*l+w*w;
         int area = l*w;
         if(diagonal>maxDiagonal){
             maxDiagonal = diagonal;
             maxarea = area;
         }
         else if(diagonal==maxDiagonal && area>maxarea)
             maxarea = area;
     }
     return maxarea;
 }

}
