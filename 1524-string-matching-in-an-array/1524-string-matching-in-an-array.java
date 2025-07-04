class Solution {
    public List<String> stringMatching(String[] words) {
        // String str = "Hello";
        // String str2="llo";
        Set <String> set = new HashSet<>();
        int i=0;
        ArrayList<String> list=new ArrayList<>();
        while(i<words.length){
            for(String s : words){
                if(words[i].contains(s) && (s.length()<words[i].length())){
                    set.add(s);
                }
            }
            i++;
        }
        for(String s: set){
            list.add(s);
        }
        return list;
    }
}