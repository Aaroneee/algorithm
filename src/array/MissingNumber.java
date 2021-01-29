package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * describe: 面试题 17.04. 消失的数字
 *
 * @Author: Aaron
 * @Date: 2021/1/29 10:42
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println("solution(nums) = " + solution(nums));
        
    }
    public static int solution(int[] nums){
        int sum=nums.length;
        for (int i=0;i<nums.length;i++){
            sum-=nums[i];
            sum+=i;
        }
        return sum;
    }
}
