package coreJava;
public class FruitsintoBasketsIII {
 public static void main(String[] args) {
	 int[] fruits = {2,3,5};
	 int[] baskets = {3,1,5};
	 System.out.print("result is: "+numOfUnplacedFruits(fruits,baskets));
 }
 public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
     int n = fruits.length;
     int m = (int)Math.sqrt(n);
     int blocks = (n+m-1)/m;
     int res = n;
     int[] max = new int[blocks];
     for(int i=0; i<n; i++){
         max[i/m] = Math.max(max[i/m],baskets[i]);
     }
     for(int fruit:fruits){
         boolean placed = false;
         for(int b=0; b<blocks; b++){
             if(max[b]<fruit) continue;
             max[b]=0;
             for(int i=0; i<m;i++){
                 int pos = b*m+i;
                 if(pos<n && !placed && baskets[pos]>=fruit){
                     baskets[pos]=0;
                     placed = true;
                 }
                 if(pos<n)
                   max[b]=Math.max(max[b],baskets[pos]);
             }
             if(placed){
                 res--;
                 break;
             }
         }
     }
     return res;
 }

}
