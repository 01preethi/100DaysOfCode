package coreJava;
import java.util.*;
import java.util.Collections;
public class SortMatrixByDiagonal {
 public static void main(String[] args) {
	 int[][] grid = {{1,7,3},{9,8,2},{4,5,6}};
	 int[][] result = sortMatrix(grid);
     System.out.println("\nSorted Matrix:");
     printMatrix(result);
 }
 // Helper function to print matrix
 private static void printMatrix(int[][] matrix) {
     for (int[] row : matrix) {
         System.out.println(Arrays.toString(row));
     }
 }
 public static int[][] sortMatrix(int[][] grid) {
     int n = grid.length;
     Map<Integer,List<Integer>> map = new HashMap<>();
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             int key = i-j;
             map.computeIfAbsent(key,k -> new ArrayList<>()).add(grid[i][j]);
         }
     }
     for(int key:map.keySet()){
         List<Integer> list = map.get(key);
         if(key>=0) list.sort(Collections.reverseOrder());
         else{
             Collections.sort(list);
         }
     }
     Map<Integer,Integer> index = new HashMap<>();
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             int k = i-j;
             int idx = index.getOrDefault(k,0);
             grid[i][j] = map.get(k).get(idx);
             index.put(k,idx+1);
         }
     }
     return grid;
 }
}
