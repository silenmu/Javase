/*
运算符之六：三元运算符
1.结构：(条件表达式)？表达式1:表达式2
2.说明：
① 条件表达式的结果为boolean类型
② 如果表达式为ture，则执行表达式1;反之，执行表达式2
③ 表达式1和表达式2要求统一为一个类型
④ 三元运算符可以嵌套使用
3.凡是使用三元运算符的地方都可以使用if-else结构；反之，不成立
4.三元运算符较于if-else效率更高、简洁
 */
public class SanYuanTest {
    public static void main(String[] args){

        //获取两个整数的较大值
        int m = 12;
        int n = 5;

        int max = (m > n)?m : n;
        System.out.println(max);

        double max1 = (m > n)? 2 : 1.0;
        System.out.println(max1);

        //没法统一
        //(m > n)?2 : "n大";//编译错误
        String maxStr = (m >n ) ? "m大" : "n大";
        System.out.println(maxStr);

        m = 5;
        String maxStr1 = (m > n) ? "m大" : ((m == n) ? "m 和 n 相等" : "n大");
        System.out.println(maxStr1);


        //获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max11 = (n1 > n2) ? n1 : n2;
        int max2 = (max11 > n3) ? max11 : n3;
        System.out.println("三个数的最大值为 ： " + max2);//推荐

        int max3 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println("三个数的最大值为 ： " + max3);



    }
}
