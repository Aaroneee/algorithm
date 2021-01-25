package backtracking;

/**
 * describe: 1688. 比赛中的配对次数
 *
 * @Author: Aaron
 * @Date: 2021/1/25 10:34
 */
public class NumberOfMatches {

    public static void main(String[] args) {
        System.out.println("solution(7) = " + solution(7));
        System.out.println("solutionTwo(7) = " + solutionTwo(7));
    }

    public static int solution(int n){
        int count=0;
        while (true){
            if (n==1){
                return count;
            }else if (n%2==1){
                count+=(n-1)/2;
                n=(n-1)/2+1;
            }else {
                count+=n/2;
                n/=2;
            }
        }
    }

    public static int solutionTwo(int n){
        return n-1;
    }
}
