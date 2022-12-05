/*
java定义的数据类型
一、变量按照数据类型来分：

    基本数据类型;
        整型: byte \ short \ int \ long;
        浮点型： float \ double;
        字符型： char;
        布尔型： boolean;

     引用数据类型;
        类 class
        接口 interface
        数组 array
二、变量在类声明中的位置：
    成员变量 vs 局部变量
 */



class VariableTest1 {
    public static void main(String[] args){
        //1.整型: byte(1字节 = 8 bit) \ short(2字节) \ int(4 字节) \ long(8字节);
        // ① byte 范围: -128 ~ 127;
        byte b1 = 2;
        byte b2 = -128;
        //byte b3 = 128;

        System.out.println(b1);
        System.out.println(b2);
//        System.out.println(b3);

        // ② 声明long 型变量，必须以'l'或'L' 结尾；
        // ③ 通常定义整型变量时，使用int型；
        short l1 = 128;
        int l2 = 1234;
        long l3 = 263781264l;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        //2.浮点型：float(4字节)\ double(8字节)；
        //① 浮点型：表示带小数点的值；
        //② float表示数值的范围比long还大；
        double d1 = 123.4;
        System.out.println(d1);
        //③ 定义float类型变量时，要在数值末尾加上‘f’或'F';
//        float f1 = 12.345;
        float f2 = 12.34F;
        System.out.println(f2);
        // ④ 通常使用 double ;

        //3.字符型： char(1字符 = 2字节);
        //① 定义char类型，通常使用一对'';
        char c1 = 'a';
        char c2 = '中';
        char c3 = 'す';
        //只能是1字符，不然会报错；
        //c1 = AB;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //② 表示方式：Ⅰ.声明一个字符 Ⅱ.转义字符 Ⅲ.使用Unicode码表示字符型常量
        char c5 = '\n';
        c5 = '\t';//'\t' 相当于tab；
        System.out.print("hello" + c5);
        System.out.println("world");
        char c6 = '\u0043';
        System.out.println(c6);

        //布尔型： boolean;
        //① 只能取两个值：true、false
        //② 常常在循环结构、条件判断时使用
        boolean bb1 = true;
        System.out.println(bb1);
        boolean isMarried = false;
        if(isMarried){
            System.out.println("你可以多谈谈女朋友");
        }else {
            System.out.println("你就不能参加\"单身\"聚会!\\n很遗憾");
        }
    }
}
