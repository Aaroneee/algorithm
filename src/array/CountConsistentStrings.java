package array;

/**
 * describe: 1684. 统计一致字符串的数目
 *
 * @Param:
 * @Return:
 * @Author: Aaron
 * @Date: 2021/1/21 10:50
 */
public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println("solution(allowed,words) = " + solution(allowed, words));
    }

    //暴力解题
    public static int solution(String allowed, String[] words){
        char[] allowedArray=allowed.toCharArray();
        int num=0;
        for (String word:words){
            for (Character c:allowedArray){
                word=word.replace(c.toString(),"");
            }
            num=word.length()>0?num:++num;

        }
        return num;
    }
}
