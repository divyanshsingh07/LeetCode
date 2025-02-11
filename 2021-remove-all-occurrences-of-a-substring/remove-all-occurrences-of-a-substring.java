class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder st=new StringBuilder();
        int partlen=part.length();
        for(char c:s.toCharArray()){
            st.append(c);
            if (st.length() >= partlen && st.substring(st.length() - partlen).equals(part)) {
                st.delete(st.length() - partlen, st.length());
            }
        }
        return st.toString();
    }
}