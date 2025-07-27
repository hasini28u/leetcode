class Solution {
    public int countHillValley(int[] nums) {
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != nums[i]) {
                arr.add(nums[i]);
            }
        }

        if(nums.length<3){
            return 0;
        }

        int left= 0;
        int middle = 1;
        int right=2;
        int count=0;
        while (right < arr.size()) {
        int l = arr.get(left);
        int m = arr.get(middle);
        int r = arr.get(right);

        if ((m > l && m > r) || (m < l && m < r)) {
            count++;
        }
        left++;
        middle++;
        right++;
    }

    return count;
        
    }
}