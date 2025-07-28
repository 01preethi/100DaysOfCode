package coreJava;
public class CountMaxOrSubsets {
    int maxOR = 0, count = 0;
    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            maxOR |= num;
        }
        dfs(nums, 0, 0);
        return count;
    }
    private void dfs(int[] nums, int index, int currentOR) {
        if (index == nums.length) {
            if (currentOR == maxOR) count++;
            return;
        }
        dfs(nums, index + 1, currentOR | nums[index]);
        dfs(nums, index + 1, currentOR);
    }
    public static void main(String[] args) {
    	CountMaxOrSubsets maxcount = new CountMaxOrSubsets();
        int[] nums = {3, 1}; 
        int result = maxcount.countMaxOrSubsets(nums);
        System.out.println("Count of subsets with max OR: " + result);
    }
}

