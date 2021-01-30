package array;

/**
 * describe: 面试题 08.03. 魔术索引
 *
 * @Author: Aaron
 * @Date: 2021/1/30 10:35
 */
public class FindMagicIndex {
    public static void main(String[] args) {
        int[] nums={0, 2, 3, 4, 5};
        System.out.println("solution(nums) = " + solution(nums));
    }
    // 100% 89%
    public static int solution(int[] nums){
        for (int i=0;i<nums.length;i++){
            if (nums[i]==i) return i;
        }
        return -1;
    }
}
