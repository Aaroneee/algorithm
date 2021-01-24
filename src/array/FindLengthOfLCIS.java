package array;

/**
 * describe: 674. 最长连续递增序列
 *
 * @Author: Aaron
 * @Date: 2021/1/24 10:54
 */
public class FindLengthOfLCIS {
    public static void main(String[] args) {
        //2,1,3
        int[] nums = {2,2,2,2,2};
        System.out.println("solution(nums) = " + solution(nums));
    }
    
    // 暴力解题
    public static int solution(int[] nums){
        if (nums.length==0) return 0;
        if (nums.length==1) return 1;
        int max=nums[0];//当前数
        int count=0;//统计长度
        int length=1;//统计当前子序列长度
        for (int i=1;i<nums.length;i++){
            length=nums[i]>max?length+1:1;
            max=nums[i];
            count= Math.max(length, count);
        }
        return count;
    }
}
