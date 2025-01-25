class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }

        double num = x / 2;
        double prevNum;

        while (true) {

            prevNum = num;
            num = (num + (x / num)) / 2;

            if (Math.floor(prevNum) % Math.floor(num) == 0.0d) {
                break;
            }
        }

        int ans = (int) Math.floor(num);
        return ans;
    }
}