package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * describe: 56. 合并区间
 *
 * @Author: Aaron
 * @Date: 2021/11/8 16:33
 */
public class Merge56 {
    public static void main(String[] args) {
        Arrays.asList(merge(new int[][]{{1, 4}, {2, 3}, {2, 5}})).forEach(k->{ System.out.println(k[0]+"-"+k[1]); });
    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        int arrLength=intervals.length;
        if (intervals.length==1){return intervals;}
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int top=intervals[0][0];
        int bottom=intervals[0][1];
        for (int i=1;i<=arrLength;i++){
            //如果屁股大于等于头&&屁股小于后屁股 则 bottom 等于后屁股
            if (bottom>=intervals[i][0]&&bottom<intervals[i][1]){
                bottom=intervals[i][1];
            }
            //如果屁股小于头 则直接赋值
            if(bottom<intervals[i][0]){
                int[] a={top,bottom};
                list.add(a);
                top=intervals[i][0];
                bottom=intervals[i][1];
            }
            if (i==arrLength-1){
                int[] a={top,bottom};
                list.add(a);
                break;
            }
        }
        int[][] newArr=new int[list.size()][2];
        return list.toArray(newArr);
    }
}
