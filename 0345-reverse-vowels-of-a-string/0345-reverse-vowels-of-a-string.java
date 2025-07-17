class Solution {
    public String reverseVowels(String s) {
        int left=0,right = s.length()-1;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder(s);
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(vowels.contains(l) && vowels.contains(r)){
                //char c = s.charAt(left);
                sb.setCharAt(left,r);
                sb.setCharAt(right,l);
                left++;
                right--;
            }
            else{
                if(!vowels.contains(l)){
                    left++;
                }
                else if(!vowels.contains(r)){
                    right--;
                }
            }

        }
        return sb.toString();
    }
}