package easy;

public class MaxProfit {

    //    public int maxProfit(int[] prices) {
//        int length = prices.length;
//        if (length < 2) {
//            return 0;
//        }
//        int[] temp = new int[length];
//        temp[0] = 0;
//        for (int i = 1; i < prices.length; i++) {
//            temp[i] = Math.max(temp[i - 1], temp[i - 1] + prices[i] - prices[i - 1]);
//        }
//        return Math.max(0, temp[length - 1]);
//    }
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length < 2) {
            return 0;
        }
        int cost = Integer.MAX_VALUE;
        int result = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            result = Math.max(result, price - cost);
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(new MaxProfit().maxProfit(new int[]{7, 6, 5, 4, 3, 2, 1}));
        System.out.println(new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}


