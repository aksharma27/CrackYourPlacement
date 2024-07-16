package July;

public class MinMovesToMakeAryEqual {
//    DAY - 3
    public static void main(String[] args) {
        int[] ar = {5,6,7,8};
        System.out.println(minMoves(ar));
    }
    static int minMoves(int[] nums) {
        int m = Integer.MAX_VALUE;
        for (int n : nums) m = Math.min(n, m);
        int ans = 0;
        for (int n : nums) ans += n - m;
        return ans;
    }
}
