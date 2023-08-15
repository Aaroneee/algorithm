package sliding_window;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * describe: 3. 无重复字符的最长子串
 *
 * @Author: Aaron
 * @Date: 2023/8/15 15:42
 */
public class lengthOfLongestSubstring3 {
    public static void main(String[] args) {
        System.out.println(solution1("abcabcbb"));
        System.out.println(solution1("bbbbb"));
        System.out.println(solution1("pwwkew"));
        System.out.println(solution1("dvdf"));
    }

    public static int solution(String s) {
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

    //相同算法也可以用list 不过耗时长
    public static int solution1(String s) {
        //存储最大长度
        int maxLength = 0;
        //因为需要去重 所以使用hash
        List<Character> list = new ArrayList<>();
        //设置开始位置
        int startIndex = 0;
        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            //如果即将添加的字符是已经存在的 则需要从头删除字符 直到把掉即将加入一样的字符给删掉 abcbb 则需要删除 a b 然后从c开始
            while (list.contains(s.charAt(endIndex))) {
                list.remove(new Character(s.charAt(startIndex)));
                startIndex++;
            }
            list.add(s.charAt(endIndex));
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }
        return maxLength;
    }
}
