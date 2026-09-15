class Solution {
    public int checkRecord(int n) {
        int MOD = 1000000007;

        // dp[a][l]
        // a = number of A's used
        // l = consecutive L's
        long[][] dp = new long[2][3];

        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            long[][] next = new long[2][3];

            for (int a = 0; a <= 1; a++) {
                for (int l = 0; l <= 2; l++) {

                    long value = dp[a][l];

                    // Add P
                    next[a][0] = (next[a][0] + value) % MOD;

                    // Add A
                    if (a == 0) {
                        next[1][0] = (next[1][0] + value) % MOD;
                    }

                    // Add L
                    if (l < 2) {
                        next[a][l + 1] =
                            (next[a][l + 1] + value) % MOD;
                    }
                }
            }

            dp = next;
        }

        long answer = 0;

        for (int a = 0; a <= 1; a++) {
            for (int l = 0; l <= 2; l++) {
                answer = (answer + dp[a][l]) % MOD;
            }
        }

        return (int) answer;
    }
}