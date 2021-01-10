package greedy;

/**
 * describe: 605. 种花问题
 * 贪心算法
 * @Author: Aaron
 * @Date: 2021/1/2 11:31
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 1, 0, 1};
//        int[] flowerbed={0,0,1,0,1};
        int n = 1;
        System.out.println("solution = " + solution(flowerbed, n));
    }

    public static boolean solution(int[] flowerbed, int n) {
        int num = 0;
        int length = flowerbed.length;
        for (int i = 0; i < length; i += 2) {
            if (flowerbed[i] == 0) {
                //判断是否是最后一格
                if (i == length - 1 || flowerbed[i + 1] == 0) {
                    num++;
                } else {
                    i++;
                }
            }
        }
        return n <= num;
    }
}




