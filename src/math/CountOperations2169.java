package math;

/**
 * describe 2169. 得到 0 的操作数
 *
 * @Param
 * @Date 2023/3/6 10:50
 * @Author Aaron
 **/
public class CountOperations2169 {
    public static void main(String[] args) {
        System.out.println("solution = " + solution(2, 3));
    }

    public static int solution(int num1, int num2) {
        int num = 0;
        while (true) {

            if (num1 == 0 || num2 == 0) return num;

            if (num1 >= num2) num1 -= num2;

            else num2 -= num1;

            num++;
        }
    }
}
