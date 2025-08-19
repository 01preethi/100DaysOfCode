package coreJava;
public class NumofZeroFilledSubarr {
 public static void main(String[] args) {
	 int[] nums = {1,3,0,0,2,0,0,4};
	 System.out.print(zeroFilledSubarray(nums));
 }
 public static long zeroFilledSubarray(int[] nums) {
     long count = 0;
     long streak = 0;
     for (int num : nums) {
         if (num == 0) {
             streak++;
             count += streak;
         } else
             streak = 0;
     }
     return count;
 }
}

//public class NumofZeroFilledSubarr {
//	 public static void main(String[] args) {
//		 int[] nums = {1,3,0,0,2,0,0,4};
//		 System.out.print(zeroFilledSubarray(nums));
//	 }
//	 public static long zeroFilledSubarray(int[] nums) {
//		   long count = 0;
//	       int n = nums.length;
//	       int right;
//	       for(int left=0; left<n; left++){
//	        if(nums[left]!=0) continue;
//	        right = left;
//	        while(right<n && nums[right]==0){
//	            count+=right-left+1;
//	            right++;
//	        }
//	        left = right-1;
//	       }
//	       return count;
//	 }
//	}
//
