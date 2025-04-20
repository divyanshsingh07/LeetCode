class Solution {
    List<String> res = new ArrayList<>();

    public void helper(int openBal, int closeBal, StringBuilder sb) {
        if (openBal == 0 && closeBal == 0) { // Base Case
            res.add(sb.toString());
            return;
        }
        if (openBal > 0) { // Add '(' if available
            sb.append('(');
            helper(openBal - 1, closeBal, sb);
            sb.deleteCharAt(sb.length() - 1); // Backtrack
        }
        if (closeBal > openBal) { // Add ')' only if it's valid
            sb.append(')');
            helper(openBal, closeBal - 1, sb);
            sb.deleteCharAt(sb.length() - 1); // Backtrack
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        helper(n, n, sb);
        return res;
    }
}