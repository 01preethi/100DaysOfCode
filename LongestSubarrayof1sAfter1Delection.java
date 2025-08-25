package coreJava;
public class LongestSubarrayof1sAfter1Delection {
 public static void main(String[] args){
	 int[] nums = {0,1,1,1,0,1,1,0,1};
	 System.out.print(longestSubarray(nums));
 }
 public static int longestSubarray(int[] nums) {
     int left =0;
     int z = 0;
     int maxlen = 0;
     for(int right=0; right<nums.length; right++){
         if(nums[right] == 0) z++;
         while(z>1){
             if(nums[left]==0) 
               z--;
             left++;
         }
         maxlen = Math.max(maxlen,right-left);
     }
     return maxlen;
 }
}
