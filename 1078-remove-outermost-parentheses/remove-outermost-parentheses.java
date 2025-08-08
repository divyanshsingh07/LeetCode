class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder r=new StringBuilder();
        int b=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') b++;
            else b--;

            if(b==0){
            r.append(s.substring(st+1,i));
            st=i+1;
          }
        }
        
        return r.toString();
    }
}