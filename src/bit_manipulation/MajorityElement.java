package bit_manipulation;

/**
 * describe: 剑指 Offer 39. 数组中出现次数超过一半的数字
 *
 * @Param: 
 * @Return: 
 * @Author: Aaron
 * @Date: 2021/2/8 13:18
 */
public class MajorityElement{
    public static void main(String[] args) {
        int[] nums={1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println("solution(nums) = " + solution(nums));
    }
    public static int solution(int[] nums){
        int num=nums[0];
        int count=1;
        for (int i=1;i<nums.length;i++){
            if (num==nums[i]){
                count++;
            }else {
                count--;
            }
            if (count==0){
                num=nums[i];
                count=1;
            }
        }
        return num;
    }
}
