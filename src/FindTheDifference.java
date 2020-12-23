public class FindTheDifference {
    /**
     * describe: 389. 找不同
     *
     * @Param:
     * @Return:
     * @Author: Aaron
     * @Date: 2020/12/23 22:01
     */
    public static void main(String[] args) {
        System.out.println("solution = " + solution("abcefg", "abcdefg"));
        System.out.println("solution = " + solutionTwo("abcefg", "abcdefg"));
    }

    //初版
    public static char solution(String s, String t) {
        StringBuilder stringBuilder = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            int flag = stringBuilder.indexOf(String.valueOf(s.charAt(i)));
            if (flag != -1) stringBuilder.deleteCharAt(flag);
        }
        return stringBuilder.toString().charAt(0);
    }

    //升级版 两个字符转为数组求int和后相减再转为char
    public static char solutionTwo(String s, String t) {
        char[] newS = s.toCharArray();
        char[] newT = t.toCharArray();
        int sSum = 0;
        for (char c : newS) {
            sSum += c;
        }
        int tSum = 0;
        for (char c : newT) {
            tSum += c;
        }
        return (char) (tSum - sSum);

    }
}
