package sliding_window;

import java.util.HashMap;
import java.util.HashSet;

/**
 * describe: 3. 无重复字符的最长子串
 *
 * @Author: Aaron
 * @Date: 2023/8/15 15:42
 */
public class lengthOfLongestSubstring3 {
    public static void main(String[] args) {
        System.out.println(solution("abcade"));
        System.out.println(solution("abcabcbb"));
        System.out.println(solution("bbbbb"));
        System.out.println(solution("pwwkew"));
        System.out.println(solution("dvdf"));
    }

    //方案1 HashMap
    public static int solution(String s) {
        //存储最大长度
        int maxLength = 0;
        int startIndex = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int endIndex = 0; endIndex < s.length(); endIndex++){
            //如果存在即将加入的值
            if (map.containsKey(s.charAt(endIndex))){
                //则把startIndex改为 该值最后一次加入的索引+1
                //如:abcade 新值:a  因为原a的值是0 所以窗口应该从0+1也就是b开始
                startIndex=Math.max(startIndex,map.get(s.charAt(endIndex))+1);
            }
            map.put(s.charAt(endIndex),endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }
        return maxLength;
    }

    //方案1 HashSet
    public static int solution1(String s) {
        //存储最大长度
        int maxLength = 0;
        //因为需要去重 所以使用hash
        HashSet<Character> hashSet = new HashSet<>();
        //设置开始位置
        int startIndex = 0;
        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            //如果即将添加的字符是已经存在的 则需要从头删除字符 直到把掉即将加入一样的字符给删掉 abcbb 则需要删除 a b 然后从c开始
            while (hashSet.contains(s.charAt(endIndex))) {
                hashSet.remove(s.charAt(startIndex));
                startIndex++;
            }
            hashSet.add(s.charAt(endIndex));
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }
        return maxLength;
    }
}
