package July;

import java.util.Arrays;

public class MergeSortedArray {
        static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1;
            int j=n-1;
            int k=nums1.length-1;

            while(j>=0){
                if(i>=0 && nums1[i]>nums2[j]){
                    nums1[k]=nums1[i];
                    k--;
                    i--;
                }else{
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                }
            }
            System.out.println(Arrays.toString(nums1));
        }

    public static void main(String[] args) {
        int[] ar1 = {1,2,3, 0, 0 , 0};
        int[] a2 = {2,5,6};
        merge(ar1, 3, a2,  3);
    }
}
