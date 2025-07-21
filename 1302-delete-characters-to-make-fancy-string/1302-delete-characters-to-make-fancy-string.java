class Solution {
    public String makeFancyString(String s) {
        if (s.length() <= 2) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        int count = 1; 
        int i = 0, j = 1;
        sb.append(s.charAt(i));

        while (j < s.length()) {
            if (s.charAt(j) == s.charAt(i)) {
                count++;
            } else {
                count = 1; 
            }

            if (count < 3) {
                sb.append(s.charAt(j));
            }

            i++;
            j++;
        }

        return sb.toString();
    }
}
