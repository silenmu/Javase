/*
两种特殊情况
 */


public class VariableTest4 {
    public static void main(String[] args){
        //编码情况1
        long l = 1234567;//1234567自动转化为int
        System.out.println(l);
        //编码失败：过大的整数
        //long l1 = 123456789011111111;
        long l1 = 123456789011111111L;

        //编码失败：
       //float f1 = 12.3;//12.3是double


        //编码情况2
        //整型常量，默认类型是int型；
        //浮点型常量，默认类型是double型。
        byte b1 = 12;
        //byte b2 = b1 + 1;//编译失败
        //float f1 = b1 + 12.3;//编译失败


    }
}
