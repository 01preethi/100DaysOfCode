/*leetcode questionno:1186
Input: arr = [1,-2,0,3]
Output: 4
Explanation: Because we can choose [1, -2, 0, 3] and drop -2, thus the subarray [1, 0, 3] 
becomes the maximum value.*/


package coreJava;

public class maxSubarr_Sum_onedel {

	public static void main(String[] args) {
		int[] arr = {1,-2,0,3};
		System.out.println("maximum subArray sum: "+ maximumSum(arr));
	}
	public static int maximumSum(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int noDel = arr[0];
        int oneDel = 0;
        for(int i =1;i<n;i++){
            oneDel = Math.max(noDel, oneDel+arr[i]);

            noDel = Math.max(arr[i],noDel+arr[i]);

            maxSum = Math.max(maxSum, Math.max(noDel,oneDel));
        }
        return maxSum;
    }

}
