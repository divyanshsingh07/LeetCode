import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> UnChars = new HashSet<>();
        int maxLength = 0;
        int leftPointer = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            while (UnChars.contains(s.charAt(rightPointer))) {
                UnChars.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            UnChars.add(s.charAt(rightPointer));
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }

        return maxLength;
    }
}