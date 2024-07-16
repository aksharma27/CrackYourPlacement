package July;
import java.util.*;

public class TwoSum {
//    DAY - 2 :
public static void main(String[] args) {
    int[] ar = {2,7,11,15};
    System.out.println(Arrays.toString(twoSum(ar, 9)));
}
    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (check.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = check.get(target - nums[i]);
                return ans;
            }
            else {
                check.put(nums[i], i);
            }
        }
        return ans;
    }
}
