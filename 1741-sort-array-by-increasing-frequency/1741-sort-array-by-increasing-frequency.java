class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int elem : nums){
            countMap.put(elem, countMap.getOrDefault(elem, 0)+1);
        }
        Integer[] numList = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            numList[i] = nums[i];
        }
        Arrays.sort(numList,new Comparator<Integer>(){
            public int compare(Integer a , Integer b){
                if(countMap.get(a)== countMap.get(b)){
                    return b - a;
                }
                return countMap.get(a)-countMap.get(b);
            }
        });
        for(int i=0;i<nums.length;i++){
            nums[i] = numList[i];
        }
        return nums;
        
    }
}