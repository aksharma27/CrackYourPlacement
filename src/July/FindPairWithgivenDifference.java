package July;

import java.util.*;

public class FindPairWithgivenDifference {
    public static void main(String[] args) {
        int[] ar = {5,20, 3, 2, 50, 80};
        System.out.println(Arrays.toString(findPair(ar, 78)));
    }

    static int[] findPair (int[] arr, int diff) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int ans[] = new int[2];
        //now check if ar[i] + k is in the map or not :
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i] + diff;
            if (freq.containsKey(sum)) {
                    ans[0] = arr[i];
                    ans[1] = sum;
                return ans;
            }
        }
        return new int[] {-1, -1};
    }

}
