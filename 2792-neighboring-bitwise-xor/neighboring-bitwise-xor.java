class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int s=0;
        for(int n: derived ){
            s+=n;
        }
        return s%2==0;

    }
}