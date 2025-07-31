package coreJava;

public class LongestNiceSubArray {

	public static void main(String[] args) {
		int[] nums = {1,3,8,48,10};
		System.out.print(longestNiceSubarray(nums));

	}
	public static int longestNiceSubarray(int[] nums) {
        int bit= 0, ans = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            while ((bit & nums[r]) != 0) {
                bit ^= nums[l++];
            }
            bit |= nums[r];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
