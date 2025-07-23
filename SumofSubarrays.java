package coreJava;

public class SumofSubarrays {
	public static void main(String [] args) {
		int arr[] = {1, 2, 3} ;
		System.out.println(subarraySum(arr));	
	}

public static int subarraySum(int[] arr) {
    int n = arr.length;
    long sum = 0;
    for(int i = 0; i<n ;i++){
        long contribution = (long) arr[i]*(i+1)*(n-i);
        sum = sum+contribution;
    }
    return (int)sum;
    
}   

}