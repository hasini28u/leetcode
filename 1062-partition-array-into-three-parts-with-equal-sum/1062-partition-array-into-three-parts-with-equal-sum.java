class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        if(avg%3 !=0){
            return false;
        }
        avg = avg/3;

        int sum = 0;
        int count = 0;
        boolean result = false;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        
            if(sum == avg){
                sum=0;
                count++;
            
                if (count == 2 && i < arr.length - 1){
                    result = true;
                    break;
                }
            }
        }
        return result;
        
    }
}