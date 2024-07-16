package July;
import java.util.*;


public class ThreeSum {
    //    DAY - 3

    public static void main(String[] args) {
        int[] ar = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(ar));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {        //avoid duplicates
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {     //avoid duplicates
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
