class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0;
        int j=0;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            }
            else{
                if(j+1<=s.length){
                    j++;
                }
            } 
            
        }
        return count;

    }  
        

}