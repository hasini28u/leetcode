class Solution {
    public int[] findErrorNums(int[] nums) {
        //Arrays.sort(nums);
        // int j=0;
        int [] res = new int [2];
        Set <Integer> s = new HashSet <Integer>();
        int duplicate = -1;
        for(Integer n : nums){
            if(!s.add(n)){
                duplicate = n;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                res[0] = duplicate;
                res[1] = i;
                break;
            }
            //j++;
        }
        return res;
        
    }
}