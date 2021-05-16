package greedy;

/**
 * describe: 944. 删列造序
 *
 * @Author: Aaron
 * @Date: 2021/5/16 11:15
 */
public class MinDeletionSize {
    public static void main(String[] args) {
        String[] strs=new String[]{"cba","daf","ghi"};
        System.out.println(" = " + solution(strs));
    }
    public static int solution(String[] strs){
        //统计错误
        int res=0;
        //获取数组里元素长度---假设 数组里 每个元素长度一样
        for (int i =0;i<strs[0].length();i++){
            //获取数组长度
            for (int j=0;j< strs.length;j++){
                //判断字节
                if (j+1<strs.length&&strs[j+1].charAt(i)<strs[j].charAt(i)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
