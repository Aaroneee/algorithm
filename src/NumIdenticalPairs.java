/**
 * describe: 1512. 好数对的数目
 *
 * @Author: Aaron
 * @Date: 2021/1/9 10:37
 */
public class NumIdenticalPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        System.out.println("solution(nums) = " + solution(nums));
    }

    /**
     * describe: 暴力解题
     *
     * @Author: Aaron
     * @Date: 2021/1/9 10:46
     */
    public static int solution(int[] nums) {
        int length=nums.length;
        int count=0;
        for(int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
}
