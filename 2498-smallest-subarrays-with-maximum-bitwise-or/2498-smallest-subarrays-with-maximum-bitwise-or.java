class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // To store the latest position of each bit (from 0 to 31)
        int[] last = new int[32];  // bit position -> farthest index
        
        for (int i = n - 1; i >= 0; i--) {
            // update bit positions from current number
            for (int b = 0; b < 32; b++) {
                if ((nums[i] & (1 << b)) != 0) {
                    last[b] = i;
                }
            }
            
            // find the farthest index we need to go from i
            int maxIdx = i;
            for (int b = 0; b < 32; b++) {
                maxIdx = Math.max(maxIdx, last[b]);
            }
            answer[i] = maxIdx - i + 1;
        }
        
        return answer;
    }
}
