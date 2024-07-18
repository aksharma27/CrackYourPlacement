package July;

public class MaxProductOfThreeNumbers {
    public static void main(String[] args) {
//        int[] ar = {2,4,5,1,8,3,9};
        int[] ar = {-1000, -1000, 1000};
        System.out.println(maximumProduct(ar));
    }

    static int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;

        int mn1 = Integer.MAX_VALUE;
        int mn2 = Integer.MAX_VALUE;
        for (int el : nums) {
            if (el > m1) {
                m3 = m2;
                m2 = m1;
                m1 = el;
            } else if (el > m2) {
                m3 = m2;
                m2 = el;
            } else if (el > m3) m3 = el;

            // if two large negatives : -(ve) * -(ve) = +(ve)
            if (el < mn1) {
                mn2 = mn1;
                mn1 = el;
            }
            else if (el < mn2) mn2 = el;
        }
        return Math.max(m1 * m2 * m3, mn1 * mn2 * m1);

    }

}
