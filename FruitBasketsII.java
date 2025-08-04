package coreJava;
public class FruitBasketsII {
 public static void main(String[] args) {
	 int[] fruits = {4,2,5};
	 int[] baskets = {3,5,4};
	 System.out.print( numOfUnplacedFruits(fruits,baskets));
 }
 public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
     int n = baskets.length;
     boolean[] used = new boolean[n];
     int unplaced = 0;
     for(int fruit : fruits){
         boolean placed = false;
         for(int i=0; i<n; i++){
             if(!used[i] && baskets[i]>=fruit){
                 used[i] = true;
                 placed = true;
                 break;
             }
         }
         if(!placed)
            unplaced++;
     }
     return unplaced;
 }

}
