class Solution {
    public double new21Game(int N, int K, int W) {
        // If K == 0, never draw → always win
        if (K == 0) return 1.0;

        double[] dp = new double[N + 1];
        double windowSum = 0.0;

        // Base case: scores >= K and <= N → stop drawing and win
        for (int i = K; i <= N; i++) {
            dp[i] = 1.0;
        }

        // Initialize windowSum: sum of dp[K..K+W-1] (up to N)
        for (int i = K; i <= Math.min(N, K + W - 1); i++) {
            windowSum += dp[i];
        }

        // Fill dp[x] for x = K-1 down to 0
        for (int x = K - 1; x >= 0; x--) {
            dp[x] = windowSum / W;

            // Update windowSum for next iteration
            // Subtract dp[x + W] only if within bounds
            if (x + W <= N) {
                windowSum -= dp[x + W];
            }
            // Add dp[x] to include new element in the window
            windowSum += dp[x];
        }

        return dp[0];
    }
}
