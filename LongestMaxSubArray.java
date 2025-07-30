package coreJava;

public class LongestMaxSubArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,3,2,2};
		System.out.println(longestSubarray(nums));
	}
	public static int longestSubarray(int[] nums) {
        int maxval = 0;
        for(int num:nums){
            maxval = Math.max(maxval,num);
        }
        int maxlen = 0,currentlen = 0;
        for(int num:nums){
            if(num == maxval){
                currentlen++;
                maxlen = Math.max(maxlen,currentlen);
            }
            else
                currentlen = 0;
        }
        return maxlen;
    }

}
