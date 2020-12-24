/**
 * describe: 1480. 一维数组的动态和
 *
 * @Param:
 * @Return:
 * @Author: Aaron
 * @Date: 2020/12/24 11:01
 */
public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int i : solution(nums)) {
            System.out.println("i = " + i);
        }
    }

    //索引为0的数不用变 从索引为1开始加索引-1即可,因为索引-1的值等于前面值的总和
    public static int[] solution(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
