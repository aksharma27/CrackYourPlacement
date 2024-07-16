package July;

public class MaxWaterStored {
    //    DAY - 3

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int maxArea = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]));
                i++;
            }
            else {
                maxArea = Math.max(maxArea, (j-i) * Math.min(height[i], height[j]));
                j--;
            }
        }
        return maxArea;
    }
}
