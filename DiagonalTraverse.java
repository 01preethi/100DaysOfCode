package coreJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DiagonalTraverse {
 public static void main(String[] args) {
	 int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
	 int[] result = findDiagonalOrder(mat);
     System.out.println("Diagonal order traversal:"+Arrays.toString(result));
 }
 public static int[] findDiagonalOrder(int[][] mat) {
     int m = mat.length;
     int n = mat[0].length;
     Map<Integer,List<Integer>> map = new HashMap<>();
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             int key = i+j;
             map.putIfAbsent(key,new ArrayList<>());
             map.get(key).add(mat[i][j]);
         }
     }
     int[] res = new int[m*n];
     int index = 0;
     for(int k=0;k<m+n-1;k++){
         List<Integer> list = map.get(k);
         if(k%2==0) Collections.reverse(list);
         for(int num:list)
           res[index++] = num;
     }
     return res;
 }
}
