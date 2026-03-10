class Solution {

    static int MOD = 1_000_000_007;
    long[][][] dp;
    int limit;

    long solve(int z, int o, int last) {

        if (z == 0 && o == 0) return 1;

        if (dp[z][o][last] != -1) return dp[z][o][last];

        long ways = 0;

        if (last == 0) { 
            // next block must be 1s
            for (int k = 1; k <= Math.min(limit, o); k++) {
                ways = (ways + solve(z, o - k, 1)) % MOD;
            }
        } 
        else { 
            // next block must be 0s
            for (int k = 1; k <= Math.min(limit, z); k++) {
                ways = (ways + solve(z - k, o, 0)) % MOD;
            }
        }

        return dp[z][o][last] = ways;
    }

    public int numberOfStableArrays(int zero, int one, int limit) {

        this.limit = limit;

        dp = new long[zero + 1][one + 1][2];

        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                for (int k = 0; k < 2; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        long ans = 0;

        for (int k = 1; k <= Math.min(limit, zero); k++) {
            ans = (ans + solve(zero - k, one, 0)) % MOD;
        }

        for (int k = 1; k <= Math.min(limit, one); k++) {
            ans = (ans + solve(zero, one - k, 1)) % MOD;
        }

        return (int) ans;
    }
}