class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int [nums.length];
        //int min= Integer.MIN_VALUE;
        //int square = 0;
        // for(int i=0;i<nums.length;i++){
        //     int n = nums[i];
        //     //square = n*n ;
        //     nums[i] = n * n ;
        // }
        int left = 0;
        int right = nums.length-1;
        int k = nums.length-1;
        while(right>=0 && k>=0){
            int l_square = nums[left] * nums[left];
            int r_square= nums[right] * nums[right];
            if(l_square > r_square){
                res[k--]=l_square;
                left++;
            }
            else{
                res[k--]=r_square;
                right--;
            }   
            
        }
        return res;
        
    }
}