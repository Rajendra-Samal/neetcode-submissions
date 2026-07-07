class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();

        // Length check
        if (n1 + n2 != n3) {
            return false;
        }

        // memo[i][j] stores the result for (i, j), or null if not computed
        Boolean[][] memo = new Boolean[n1 + 1][n2 + 1];

        return can(0, 0, s1, s2, s3, memo);
    }

    private boolean can(int i, int j,
                        String s1, String s2, String s3,
                        Boolean[][] memo) {
        int k = i + j; // current index in s3

        // Base case: all strings fully used
        if (k == s3.length()) {
            return i == s1.length() && j == s2.length();
        }

        // Return memoized result if present
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        boolean res = false;

        // Try taking from s1
        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            if (can(i + 1, j, s1, s2, s3, memo)) {
                res = true;
            }
        }

        // If not already true, try taking from s2
        if (!res && j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            if (can(i, j + 1, s1, s2, s3, memo)) {
                res = true;
            }
        }

        // Store and return
        memo[i][j] = res;
        return res;
    }
}