/*
基本数据类型之间的运算规则：
前提：这里只讨论除了布尔类型的7种数据类型。
1、自动类型提升；
    结论：当容量小的数据类型和容量大的数据类型做运算时，结果自动提升为容量大的类型；
    说明：此时容量大小是指属的范围大小，比如：float容量大于long容量，不代表占用内存大小；
        byte、short、char --> int --> long --> float --> double ;
        特别的，当 byte 、short 、char 三种变量做运算时，结果转化成int型及更大类型。

2、强制类型转换:下一class

 */

public class VariableTest2 {
    public static void main(String[] args){
        byte b1 = 2;
        int i1 = 128;
        //编译不通过;
        //byte b2 = b1 + i1;
        int i2 = b1 + i1;
        System.out.println(i2);

        float f1 = b1 + i2;
        System.out.println(f1);

        /**
        short s11 = 11;
        byte b11 = 22;
        long l11 = b11+s11;
        System.out.println(l11);
        **/

        /**********************
        //说明 int -- > char
        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        //说明 char不大于 short、byte
        short s2 = 10;
       // char c2 = c1 + s2;//编译失败
        System.out.println(c2);

        byte b2 = 10;
       // short s4 = b1 + b2;//编译失败
         **********************/

    }
}
