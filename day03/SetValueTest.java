/*
运算符之二：赋值运算符
= += -= *= /= %=

 */
public class SetValueTest {
    public static void main(String[] args){
        //赋值符号：=
        int i1 = 10;
        int j1 = 10;

        //连续赋值
        int i2,j2;
        i2 = j2 = 10;

        //公用int
        int i3 = 10,j3 = 20;

        //

        short s1 = 10;
        //s1 = s1 + 2;//编译不通过
        s1 += 2;//不会改变数据类型
        System.out.println(s1);

        //开发中，实现+2的操作方法：(前提是 int num = 10;)
        //方法一：num = num + 2;
        //方法二： num += 2;(推荐)

        //开发中，实现+1的操作方法：(前提是 int num = 10;)
        //方法一：num = num + 1;
        //方法二： num += 1;
        //方法三：num++;(推荐)


    }
}
