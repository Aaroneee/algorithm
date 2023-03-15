package array;

import java.util.Arrays;

/**
 * describe 453. 最小操作次数使数组元素相等
 *
 * @Param
 * @Date 2023/3/15 9:16
 * @Author Aaron
 **/
public class MinMoves453 {
    public static void main(String[] args) {
        System.out.println("minMoves(new int[]{1, 2, 3}) = " + solution2(new int[]{1, 2, 3}));
        System.out.println("minMoves(new int[]{1, 1, 1}) = " + solution2(new int[]{1, 1, 1}));
        System.out.println("minMoves(new int[]{1, 1, 1}) = " + solution2(new int[]{1,1000000000}));
    }

    // 先获取最大的数以及下标
    // 每次循环 判断 如果小了就+1
    // 已超时
    public static int solution(int[] nums) {
        //最大数
        int maxNum = 0;
        //最大数 下标
        int maxIndex=0;
        //次数
        int num = 0;
        //每次操作都会使数组长度-1个值+1
        while (true){
            //找出最大数和最大数坐标
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]>maxNum){
                    maxNum=nums[i];
                    maxIndex=i;
                }
            }
            boolean flag=true;
            for (int i = 0; i < nums.length; i++) {
                //如果不等于最大值则说明还需要循环
                if (nums[i]!=maxNum){
                    flag=false;
                }
                if (i==maxIndex) continue;
                nums[i]++;
            }
            if (flag) break;
            num++;
        }
        return num;
    }
    //计算每个值到最小值的所需要的次数
    //获取最小值 (for循环速度快 内存高，使用Stream速度慢 内存低)
    public static int solution2(int[] nums) {

//        int minNum = Arrays.stream(nums).min().getAsInt();

        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            minNum=nums[i]<minNum?nums[i]:minNum;
        }
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num+=nums[i]-minNum;
        }
        return num;
    }

}
