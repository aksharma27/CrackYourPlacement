package July;

import java.util.*;

public class AllDuplicatesInconstSpace {
//    DAY - 3

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] < 0) ans.add(x);
            else nums[x - 1] *= -1;
            System.out.println(Arrays.toString(nums));
            System.out.println(ans);
        }
        return ans;
}

}
