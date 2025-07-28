package coreJava;
public class MatrixDiogonalSum {
	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2},
			    {3, 4}
			};
		 int n = matrix.length;
	     int result = findMinOperation(matrix, n);
	     System.out.println("Minimum operations required: " + result);  
	}
    public static int findMinOperation(int[][] matrix, int n) {
	        int[] rowSum = new int[n];
	        int[] colSum = new int[n];
	        int maxSum = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                rowSum[i] += matrix[i][j];
	                colSum[j] += matrix[i][j];
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            maxSum = Math.max(maxSum, rowSum[i]);
	            maxSum = Math.max(maxSum, colSum[i]);
	        }
	        int operations = 0;
	        for (int i = 0; i < n; i++) {
	            operations += (maxSum - rowSum[i]);
	        }

	        return operations;
	    }
	}
