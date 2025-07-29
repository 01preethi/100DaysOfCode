package coreJava;
public class SmallestSubarraysWithMaxOR {
	public static void main(String[] args) {
		SmallestSubarraysWithMaxOR sub = new SmallestSubarraysWithMaxOR();
        int[] nums = {1, 0, 2, 1, 3};
        int[] result = sub.smallestSubarrays(nums);

        for (int val : result) {
            System.out.print(val + " ");
          }
        }
	public static int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = 1;
            for (int b = i - 1; b >= 0; b--) {
                if ((nums[b] | nums[i]) == nums[b]) 
                  break;
                nums[b] |= nums[i];
                res[b] = i - b + 1;
            }
        }
        return res;
       }	      
}
