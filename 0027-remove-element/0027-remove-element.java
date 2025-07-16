class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0; // count of 'val' elements removed
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                // Replace nums[i] with the last element
                nums[i] = nums[n - 1];
                n--; // reduce array size since the last element is considered removed
                count++;
                // Do not increment i here, as the new nums[i] may also be val, so check again.
            } else {
                i++; // only increment when current element is not val
            }
        }
        return n; // new length without val
    }
}
