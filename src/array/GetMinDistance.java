package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * describe: 1848. 到目标元素的最小距离
 *
 * @Author: Aaron
 * @Date: 2021/5/29 11:17
 */
public class GetMinDistance {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        System.out.println("solution = " + solution(nums, 1, 9));
    }

    public static int  solution(int[] nums, int target, int start){
        List<Integer> minList=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                minList.add(Math.abs(i-start));
            }
        }
        minList.sort(Comparator.naturalOrder());
        return minList.size()==0?0:minList.get(0);
    }
}
