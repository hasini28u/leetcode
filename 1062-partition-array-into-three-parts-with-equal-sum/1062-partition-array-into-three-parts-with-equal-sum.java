class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int avg=0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
            res.add(arr[i]);
        }
        if(avg%3 !=0){
            return false;
        }
        avg = avg/3;

        int sum = 0;
        int count = 0;
        //boolean isPresent = false;
        boolean result = false;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            // if(sum < avg){
            //     isPresent = res.contains(sum-avg);
            // }
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