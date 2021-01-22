package array;

/**
 * describe: 1662. 检查两个字符串数组是否相等
 *
 * @Param:
 * @Return: 
 * @Author: Aaron
 * @Date: 2021/1/22 10:38
 */
public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1  = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println("solution = " + solution(word1, word2));
    }

    public static boolean solution(String[] word1, String[] word2){
        return String.join("", word1).equals(String.join("", word2));
    }
}
