package greedy;

import java.util.Arrays;

/**
 * describe: 1710. 卡车上的最大单元数
 *
 * @Author: Aaron
 * @Date: 2021/5/30 10:49
 */
public class MaximumUnits {

    public static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println(solution( boxTypes,10));
    }

    public static int solution(int[][] boxTypes, int truckSize) {
        //将能装载数量多的放最前
        Arrays.sort(boxTypes, (o1, o2) -> o2[1]-o1[1]);
        int num=0;
        for (int[] box:boxTypes){
            //如果可装载量小于盒子数量则按照truckSize数量来添加
            if (truckSize<box[0]){
                num+=truckSize*box[1];
                truckSize-=truckSize;
            }else {
                num+=box[0]*box[1];
                truckSize-=box[0];
            }
            if (truckSize==0) return num;
        }
        return num;
    }
}
