package math;

/**
 * describe: 258. 各位相加
 *
 * @Param: 
 * @Return: 
 * @Author: Aaron
 * @Date: 2021/2/18 11:10
 */
public class AddDigits {
    public static void main(String[] args) {
        System.out.println("args = " + 9%9);
        System.out.println("solution(38) = " + solution(38));
        System.out.println("solutionTwo(38) = " + solutionTwo(38));
    }

    //耗时1ms 100%
    //耗内存35.4 77.48%
    public static int solution(int num){
        if (num<10){
            return num;
        }
        if (num%9==0){
            return 9;
        }
        return num%9;
    }

    //耗时1ms 100%
    //耗内存35.6 49.09%
    public static int solutionTwo(int num){
        return (num-1)%9+1;
    }
}
