package coreJava;
import java.util.Arrays;
public class ValidTriangleNum {
	public static void main(String[] args) {
		int[] nums = {4,2,3,4};
		System.out.print("output: "+triangleNumber(nums));	
	}
	public static int triangleNumber(int[] nums){
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int k =n-1;k>=2;k--){
            int l = 0;
            int r = k-1;
            while(l<r){
                if(nums[l]+nums[r] > nums[k]){
                   count+=(r-l);
                   r--;
                }
                else
                    l++;
            }
        }
        return count;
    }
}
