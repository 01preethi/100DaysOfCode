package coreJava;
public class ArrayTriangularSum {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.print("sum is: "+triangularSum(nums));
	}
	public static int triangularSum(int[] nums) {
        int n = nums.length;
        for(int j=n-1;j>0;j--){
            for(int i=0;i<j;i++){
                nums[i] = (nums[i]+nums[i+1])%10;
            }
        }
        return nums[0];
    }
}
