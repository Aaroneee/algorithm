package string;

    /**
     * describe: 2288. 价格减免
     *
     * @Author: Aaron
     * @Date: 2024/6/20 14:40
     */
public class DiscountPrices {

    public static void main(String[] args) {
        String a = discountPrices("there are $1 $2 and 5$ candies in the shop", 26);
        System.out.println(a)
    }

    public String discountPrices(String sentence, int discount) {
        double disBigDecimal = (100.0 - Double.parseDouble(String.valueOf(discount))) / 100.0;
        //先查询字符串中包含$的字符以及位置
        if (sentence.isEmpty()) return "";
        StringBuilder newSentence = new StringBuilder();
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String replacedStr = strings[i].replace("$", "");
            // 包含$ && 第0位是$ && 只有一个$ && 长度大于1
            if (strings[i].contains("$") && strings[i].getBytes()[0] == '$' && strings[i].length() - replacedStr.length() == 1 && strings[i].length() > 1) {
                if (0 == disBigDecimal) {
                    strings[i] = "$0.00";
                } else {
                    try {
                        Double v = disBigDecimal * Double.valueOf(Long.parseLong(replacedStr));
                        strings[i] = "$" + String.format("%.2f", v);
                    } catch (Exception e) {}
                }
            }
            newSentence.append(strings[i]);
            if (i + 1 == strings.length) break;
            else newSentence.append(" ");
        }
        return newSentence.toString();
    }
}
