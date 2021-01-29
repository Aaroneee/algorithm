package array;

/**
 * describe: 724. 寻找数组的中心索引
 *
 * @Author: Aaron
 * @Date: 2021/1/29 12:07
 */
public class PivotIndex {

    public static void main(String[] args) {
        int[] nums={0, 0, 0, 0, 1};
        System.out.println("solution(nums) = " + solution(nums));
    }

    public static int solution(int[] nums) {
        //stream流费时
        int sum= 0;
        for (int num :nums){
            sum+=num;
        }
        int numsLength=nums.length;
        int n=0;
        for (int i=0;i<numsLength;i++){
            if (n==sum-nums[i]-n){
                return i;
            }
            n+=nums[i];
        }
        return -1;
    }
}
