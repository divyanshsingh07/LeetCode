public class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.toString().contains(b)) return count;

        sb.append(a);
        if (sb.toString().contains(b)) return count + 1;

        return -1; 
    }
}