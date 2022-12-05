/*
Srting类型变量的使用
1.String类型属于引用数据类型
2.声明String类型时，要用一堆“”
3.String类型可以与8种基本类型做运算，且只能是连接运算：+
4.运算结果仍然是String


 */

public class StringTest {
    public static void main(String[] args){
        String s1 = "Hello World!";
        System.out.println(s1);
        String s2 = "a";
        String s3 = "";
//        char c = "";//char类型里面要有内容
//        char c1 =" ";//也不能是空格
        System.out.println(s2);
        System.out.println(s3);

        //************************
        int number = 180103256;
        String numberStr = "学号：";
        String info = numberStr + number;
        System.out.println(info);

        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);

        //************************
        //练习1
        char c ='a';//97 A:65
        int num = 10;
        String str = "hello";
        System.out.println(c + num +str);
        System.out.println(c + str +num);
        System.out.println(c + (num +str));
        System.out.println((c + num) +str);
        System.out.println(str + num +c);
        /*107hello
        ahello10
        a10hello
        107hello
        hello10a*/

        //练习2
        //输出：*  *
        System.out.println("*       *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));

    }
}
