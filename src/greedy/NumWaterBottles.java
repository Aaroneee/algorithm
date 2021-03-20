package greedy;

/**
 * describe: 1518. 换酒问题
 *
 * @Author: Aaron
 * @Date: 2021/3/20 14:21
 */
public class NumWaterBottles {

    public static void main(String[] args) {
        System.out.println("solution = " + solution(15,4));
    }

    public static int solution(int numBottles, int numExchange){
        //统计每次换完瓶后的的数量
        int surplus=numBottles;
        //统计每次的余数
        int num=0;
        //统计一共多少酒瓶
        int count=numBottles;
        while (surplus>=numExchange){
            num+=surplus%numExchange;
            surplus=surplus/numExchange;
            count+=surplus;
            surplus+=num;
            num=0;
        }
        return count;
    }
}
