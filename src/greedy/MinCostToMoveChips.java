package greedy;

/**
 * describe: 1217. 玩筹码
 *
 * @Param:
 * @Return:
 * @Author: Aaron
 * @Date: 2021/5/17 10:52
 */
public class MinCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println("solution() = " + solution(position));
    }

    //其实是求偶数个数或奇数个数 哪个数小
    public static int solution(int[] position) {
        int result1 = 0;
        int result2 = 0;
        for (int j : position) {
            if (j % 2 == 0) {
                result1++;
            } else {
                result2++;
            }
        }
        return Math.min(result1, result2);
    }
}
