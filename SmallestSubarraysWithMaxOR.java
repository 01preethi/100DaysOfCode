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
        int[] result = new int[n];
        int[] lstSeen = new int[32]; 
        
        for (int i = 0; i < 32; i++) {
            lstSeen[i] = -1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int bit = 0; bit < 32; bit++) {
                if ((nums[i] & (1 << bit)) != 0) {
                    lstSeen[bit] = i;
                }
            }
            int maxIndex = i;
            for (int bit = 0; bit < 32; bit++) {
                maxIndex = Math.max(maxIndex, lstSeen[bit]);
            }
            result[i] = maxIndex - i + 1;
        }
        return result;
    }
}
