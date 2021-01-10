package array;

/**
 * describe: 1672. 最富有客户的资产总量
 *
 * @Author: Aaron
 * @Date: 2020/12/3 12:19
 */
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println("maximumWealth(accounts) = " + maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        //统计最大的数
        int max = 0;
        //循环每一个人
        for (int[] man : accounts) {
            int wealthSum = 0;
            //循环一个人的所有财富
            for (int money : man) {
                wealthSum += money;
            }
            max = Math.max(wealthSum, max);
        }
        return max;
    }
}
