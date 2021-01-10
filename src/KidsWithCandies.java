import java.util.ArrayList;
import java.util.List;

/**
 * describe: 1431. 拥有最多糖果的孩子
 *
 * @Param:
 * @Return:
 * @Author: Aaron
 * @Date: 2021/1/10 10:44
 */
public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        solution(candies,extraCandies).forEach(k->{
            System.out.println("k = " + k);
        });
    }

    public static List<Boolean> solution(int[] candies, int extraCandies) {
        int max=0;
        for (int i : candies){
            max= Math.max(i, max);
        }
        List<Boolean> list=new ArrayList<>();
        for (int i: candies){
            list.add(i + extraCandies >= max);
        }
        return list;
    }
}
