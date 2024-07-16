package July;
import java.util.*;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int[] ar = {1,2,3};
        System.out.println(subarraySum(ar, 3));
    }

    static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int prefix = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (prefix == k) count++;

            if (freq.containsKey(prefix - k)){
                count += freq.get(prefix-k);
            }
            freq.put(prefix, freq.getOrDefault(prefix, 0)+1);
        }
        return count;
    }
}
