package coreJava;
import java.util.Arrays;
public class LargestPerimeterTriangle {
	public static void main(String[] args) {
		int[] nums = {2,1,2};
		int[] nums1 = {1,1,2,10};
		System.out.println(largestPerimeter(nums));
	}
	public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=n-1;i>=2;i--){
            if((nums[i-2]+nums[i-1]) > nums[i])
               return nums[i-2]+nums[i-1]+nums[i];
        }
        return 0;
    }
}
