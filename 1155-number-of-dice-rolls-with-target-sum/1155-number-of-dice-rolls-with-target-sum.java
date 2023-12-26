class Solution {
    private int[][] dp = new int[31][1001];
    private final int MOD = 1000000007;

    public int numRollsToTarget(int d, int f, int target) {
        for (int i = 0; i <= d; i++) {
            Arrays.fill(dp[i], 0);
        }

        int res = helper(d, f, target);
        return res;
    }

    private int helper(int d, int f, int target) {
        if (d == 0 || target <= 0) {
            return d == target ? 1 : 0;
        }

        if (dp[d][target] != 0) {
            return dp[d][target] - 1;
        }

        int result = 0;
        for (int i = 1; i <= f; ++i) {
            result = (result + helper(d - 1, f, target - i)) % MOD;
        }

        dp[d][target] = result + 1;
        return result;
    }
}
