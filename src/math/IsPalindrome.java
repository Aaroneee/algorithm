package math;

/**
 * describe: 9. 回文数
 *
 * @Param:
 * @Return:
 * @Author: Aaron
 * @Date: 2022/11/01 20:20
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("solution = " + solution(12321));
        System.out.println("solution1(0232) = " + solution1(12321));
    }

    //粗暴解法
    public static Boolean solution(int x) {
        return new StringBuffer(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }

    //算法解法
    public static Boolean solution1(int x) {
        //小于0 或最后一位是0(说明第一位也要是0 没有这样的数所以返回false) 且不等于0(0是回文数)
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int revNum = 0;
        //如果大于则说明数据没有分割到一半 比如1221 -> 122 1 -> 12 12
        while (x > revNum) {
            //转换后面一半
            //乘10是为了放个位数
            revNum = revNum * 10 + x % 10;
            //每次除去X最后一位 并给了revNum顺序排放
            x /= 10;
        }
        //如果长度为偶数则会走第一个
        //如果为奇数则走后面判断然后再删除中间那位进行对比 如12321 -> 12 123 -> 12 12
        return x == revNum || x == revNum / 10;
    }
}
