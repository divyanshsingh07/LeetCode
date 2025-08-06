class Solution {
    public String countAndSay(int n) {

        if(n==1) return "1";
        String say = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<say.length(); ){
            char ch = say.charAt(i);
            int count = 1;
             while (i + 1 < say.length() && say.charAt(i) == say.charAt(i + 1)){
                count++;
                i++;
            }
            result.append(count).append(ch);
            i++;

        }
        return result.toString(); 
           
    }
}