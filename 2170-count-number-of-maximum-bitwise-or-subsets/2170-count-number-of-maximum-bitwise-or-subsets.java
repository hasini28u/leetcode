class Solution {
    int count = 0;
    int maxOR = 0;

    public int countMaxOrSubsets(int[] nums) {
        // Step 1: Find the maximum OR possible using all elements
        for (int num : nums) {
            maxOR |= num;
        }

        // Step 2: Start backtracking
        backtrack(nums, 0, 0);
        return count;
    }

    private void backtrack(int[] nums, int index, int currentOR) {
        if (index == nums.length) {
            if (currentOR == maxOR) {
                count++;
            }
            return;
        }

        // Include nums[index]
        backtrack(nums, index + 1, currentOR | nums[index]);

        // Exclude nums[index]
        backtrack(nums, index + 1, currentOR);
    }
}
