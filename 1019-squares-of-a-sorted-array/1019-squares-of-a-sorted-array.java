class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int [nums.length];
        //int min= Integer.MIN_VALUE;
        //int square = 0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            //square = n*n ;
            nums[i] = n * n ;
        }
        int left = 0;
        int right = nums.length-1;
        int k = nums.length-1;
        while(right>=0 && k>=0){
            if(nums[left]>nums[right]){
                res[k--]=nums[left];
                left++;
            }
            else{
                res[k--]=nums[right];
                right--;
            }
           
            
            
        }
        return res;
        
    }
}