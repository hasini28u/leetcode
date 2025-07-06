class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()<=1){
            return false;
        }
        String small = "";
        for(int i=1;i<=s.length()/2;i++){
            small = s.substring(0,i);
            if(s.length()%small.length()==0){
                int repeat = s.length()/small.length();
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<repeat;j++){
                    sb.append(small);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
            
        }
        return false;
        
    }
}