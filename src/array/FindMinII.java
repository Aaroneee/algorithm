package array;

/**
 * describe: 154. 寻找旋转排序数组中的最小值 II
 *
 * @Param:
 * @Return: 
 * @Author: Aaron
 * @Date: 2022/7/14 14:07
 */
public class FindMinII {
    public static void main(String[] args) {
        int[] nums ={1,3,5};
        System.out.println("findMin(nums) = " + findMinII(nums));
    }
    public static int findMinII(int[] nums) {
        int min=nums[0];
        for (int i=1;i<nums.length;i++){
            min=min<=nums[i]?min:nums[i];
        }
        return min;
    }
}
