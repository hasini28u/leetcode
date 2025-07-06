class Solution {
    public char kthCharacter(int k) {
        String string = "a";
        String str_copy = "";
        
        if(k==1){
            return 'a';
        }
        while(true){
            //str_copy = string;
            String mini =""; 
            for(char c : string.toCharArray()){
                int count=(int)c+1;
                char a = (char) count;
                mini = mini.concat(String.valueOf(a));
            }
            string=string.concat(mini);
            if(string.length()>=k){
                return string.charAt(k-1);
            }
        }
        
    }

}