import java.lang.Math;
class Solution {
    public int calculateTime(String keyboard, String word) {
        int j=0;
        int index=0,presentindex=0,pastindex=0;
        int sum=0;
        while(j<word.length()){
            index = keyboard.indexOf(word.charAt(j));
            
            presentindex = Math.abs(pastindex-index);
            sum +=presentindex;
            pastindex=index;
            j++;
        }
        return sum;

        
    }
}