class Solution {
    public int minStartValue(int[] nums) {
        int i=0;
        int StartValue=1;
        while(true){
            int store = nums[0]+StartValue;
            ArrayList <Integer> arr= new ArrayList<>();
            arr.add(store);
            boolean foundZero=false;
            for(i=1;i<nums.length;i++){;
                store+=nums[i];
                arr.add(store);
            }
            for(Integer num : arr ){
                if(num<=0){
                    foundZero=true;
                    break;
                }
            }
            if(!foundZero){
            return StartValue;
            } 
            StartValue++;
        }  
    }
}