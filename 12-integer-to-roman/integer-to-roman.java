class Solution {
    public String intToRoman(int num) {
        int[] V = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<V.length;i++){
            while(num>=V[i]){
                roman.append(symbols[i]);
                num -= V[i];
            }
        }
        return roman.toString();

        
    }
}