package July;

public class ClimbingStairs {
//        DAY - 4:
    static int climbStairs(int n) {
        int dp[] = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = dp[0] + dp[1];
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
