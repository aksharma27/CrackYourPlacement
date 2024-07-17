package July;

public class MaxPointsFromCard {
//    DAY - 4
    static int maxScore(int[] cardPoints, int k) {
        int ans = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        k--; int i = cardPoints.length - 1;
        ans = sum;
        while (k >= 0) {
            sum = sum - cardPoints[k] + cardPoints[i];
            k--;
            i--;
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        System.out.println(maxScore(cardPoints, 3));
    }
}
