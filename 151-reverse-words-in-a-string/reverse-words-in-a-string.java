class Solution {
    public String reverseWords(String s) {
        String []s1=s.split(" ");
        StringBuilder rev=new StringBuilder();
       for (int i = s1.length - 1; i >= 0; i--) {
            rev.append(s1[i]).append(" ");
        }
        return rev.toString().replaceAll("\\s+", " ").trim();
    }
}