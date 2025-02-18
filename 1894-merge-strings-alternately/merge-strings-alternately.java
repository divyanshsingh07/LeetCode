class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder r = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length()&&j<word2.length()){
            r.append(word1.charAt(i++));
            r.append(word2.charAt(j++));
        }
        while(i<word1.length()){
             r.append(word1.charAt(i++));
        }
        while(j<word2.length()){
             r.append(word2.charAt(j++));
        }
        
        return r.toString();
    }
}