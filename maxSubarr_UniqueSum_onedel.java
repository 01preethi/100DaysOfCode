/*leetcode questionno:3487
Input: nums = [1,2,3,4,5]
Output: 15
Explanation:
Select the entire array without deleting any element to obtain the maximum sum.*/

package coreJava;

import java.util.HashSet;
import java.util.Set;

public class maxSubarr_UniqueSum_onedel {
	public static void main(String [] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println("maximum subArray sum: "+ maxSum(nums));
	}
	public static int maxSum(int[] nums) {
         Set<Integer> set = new HashSet<>();
         int start = 0,sum = 0,maxsum = Integer.MIN_VALUE;
         for(int end =0; end<nums.length; end++){
             while(set.contains(nums[end])){
                 set.remove(nums[start]);
                 sum -= nums[start];
                 start++;
             }
             set.add(nums[end]);
             sum += nums[end];
             maxsum = Math.max(maxsum,sum);
         }
         return maxsum;
	}

}
