package July;
import java.util.*;

public class SubArrSumDivByK {
    //    DAY - 3

    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,-1};
        System.out.println(subarraysDivByK(arr, 5));
    }
    static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        int sum = 0;
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum = ((sum + nums[i])  % k);

            if (sum < 0) sum +=k;
            ans += freq.getOrDefault(sum, 0);
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
