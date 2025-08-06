class Solution {
    public int compareVersion(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");

        int len1 = parts1.length;
        int len2 = parts2.length;
        int i = 0;

        while (i < len1 || i < len2) {
            int num1 = 0;
            int num2 = 0;

            if (i < len1) {
                num1 = Integer.parseInt(parts1[i]);
            }

            if (i < len2) {
                num2 = Integer.parseInt(parts2[i]);
            }

            if (num1 != num2) {
                if (num1 == num2 + Math.abs(num1 - num2)) {
                    return 1; 
                } else {
                    return -1;
                }
            }

            i++;
        }

        return 0; // both versions are equal
    }
}