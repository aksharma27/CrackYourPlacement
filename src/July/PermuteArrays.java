package July;

import java.util.*;

public class PermuteArrays {
//    Given two arrays of equal size n and an integer k. The task is to permute both arrays such that sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is to print “Yes” if any such permutation exists, otherwise print “No”.
public static void main(String[] args) {
    Integer a[] = {2, 1, 3};
    int b[] = {7, 8, 9};
    int k = 10;
    System.out.println(permuteCheck(a, b, k));
}

static boolean permuteCheck (Integer[] ar1, int[] ar2, int k) {
    //IDEA :-
//    1) sort first array in asc order, 2nd array in descending order => Now iterate and check if sum of ith elements of both array is >= K, if any element is not
//        satisfying the condition, then return false
    Arrays.sort(ar1, Collections.reverseOrder());
    Arrays.sort(ar2);
    for (int i = 0; i < ar2.length; i++) {
        if(ar1[i] + ar2[i] < k) return false;
    }
    return true;
}
}
