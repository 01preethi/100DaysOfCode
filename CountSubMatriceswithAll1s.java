package coreJava;
public class CountSubMatriceswithAll1s {
 public static void main(String[] args) {
	 int[][] mat = {{1,0,1},{1,1,0},{1,1,0}};
	 System.out.print(numSubmat(mat));
 }
 public static int numSubmat(int[][] mat) {
     int m = mat.length;
     int n = mat[0].length;
     int[][] h = new int[m][n];
     for(int i=0; i<m; i++){
         for(int j=0; j<n; j++){
             if(mat[i][j] == 0) h[i][j] = 0;
             else 
               h[i][j] = (i==0)?1:h[i-1][j]+1;
         }
     }
     int total = 0;
     for(int i=0; i<m; i++){
         for(int j=0; j<n; j++){
             if(h[i][j]>0){
                 int minheight = h[i][j];
                 for(int k=j; k>=0; k--){
                     if(h[i][k]==0) break;
                     minheight = Math.min(minheight,h[i][k]);
                     total += minheight;
                 }
             }
         }
     }
     return total;
 }

}
