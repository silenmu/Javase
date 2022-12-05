/*
强制类型转化：自动类型提升运算的逆运算。
1.需要使用强制转化符：()
2.主要点：强制转化^可能^损失精度




 */



public class VariableTest3 {
    public static void main(String[] args){
        //精度损失 1
        double d1 = 12.3;
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        //没有精度损失
        long l1 = 123;
        short s1 = (short) l1;

        //精度损失 2
        int i2 = 128;
        byte b1 = (byte)i2;
        System.out.println(b1);//-128
    }
}
