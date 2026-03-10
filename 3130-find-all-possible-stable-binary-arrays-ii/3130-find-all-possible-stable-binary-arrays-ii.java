class Solution {

    static int mod = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        for (int i = 1; i <= Math.min(zero, limit); i++) {
            dp0[i][0] = 1;
        }

        for (int j = 1; j <= Math.min(one, limit); j++) {
            dp1[0][j] = 1;
        }

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {

                dp0[i][j] = (dp0[i-1][j] + dp1[i-1][j]) % mod;

                if (i - limit - 1 >= 0) {
                    dp0[i][j] = (dp0[i][j] - dp1[i-limit-1][j] + mod) % mod;
                }

                dp1[i][j] = (dp0[i][j-1] + dp1[i][j-1]) % mod;

                if (j - limit - 1 >= 0) {
                    dp1[i][j] = (dp1[i][j] - dp0[i][j-limit-1] + mod) % mod;
                }
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % mod);
    }
}