package coreJava;
import java.util.Arrays;
public class NumofWayToPlacePeopleII {
 public static void main(String[] args) {
	 int[][] points = {{6,2},{4,4},{2,6}};
	 System.out.println("Number of valid pairs: " +numberOfPairs(points));
 }
 public static int numberOfPairs(int[][] points) {
     int n = points.length;
     Arrays.sort(points,(a,b)->{
         if(a[0]==b[0]){
             return b[1]-a[1];
         }
         return a[0]-b[0];
     });
     int res =0;
     for(int i=0;i<n;i++){
         int aX = points[i][0];
         int aY = points[i][1];
         int bestbY = Integer.MIN_VALUE;
         for(int j=i+1;j<n;j++){
             int bX = points[j][0];
             int bY = points[j][1];
             if(bY>aY) continue;
             if(bY>bestbY){
                 res++;
                 bestbY = bY;
             }
         }
     }
     return res;
 }

}

