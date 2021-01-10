package string;

public class GoalAnalysis {

    /**
     * describe: 1678. 设计 Goal 解析器
     *
     * @Param:
     * @Return:
     * @Author: Aaron
     * @Date: 2020/12/9 16:44
     */
    public static void main(String[] args) {
        System.out.println("interpret() = " + interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
