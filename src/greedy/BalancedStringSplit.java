package greedy;

/**
 * describe: 1221. 分割平衡字符串
 *
 * @Author: Aaron
 * @Date: 2021/1/10 11:45
 */
public class BalancedStringSplit {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println("solution(s) = " + solution(s));
    }


    public static int solution(String s){
        //判断是否是平衡字符串
        int flag=0;
        //统计阁主
        int num =0;
        char[] sArray=s.toCharArray();
        for (char value : sArray){
            if (value == 'R') {
                flag++;
            } else {
                flag--;
            }
            if (flag==0){
                num++;
            }
        }
        return num;
    }
}
