package July;

public class JumpGame {
    static  boolean canJump(int[] nums) {
        int n = nums.length;
        int reachable = 0;
        for (int i = 0; i < n; i++) {
            if (reachable < i) return false;
            reachable = Math.max(reachable, i + nums[i]);
            // System.out.println(i + " " + reachable);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ar = {1,1,2,5 ,2,1,0,0,1,3};
        System.out.println(canJump(ar));
    }
}
