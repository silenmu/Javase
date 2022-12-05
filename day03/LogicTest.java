/*
运算符之三：比较运算符
& && | || ! ^

说明：
逻辑运算符操作的都是boolean类型的变量

 */


public class LogicTest {
    public static void main(String[] args){

        //区分 & 与 &&
        //相同点1：& 和 && 的运算结果都一样
        //相同点2：当符号左边是true时，二者都会执行右边的运算
        //不同点1：当符号左边是false时，&会执行右边的运算，而&&不会执行右边的运算
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num2 = " + num2);



        //区分 | 和 ||
        //相同点1：| 和 || 的运算结果都一样
        //相同点2：当符号左边是false时，二者都会执行右边的运算
        //不同点1：当符号左边是ture时，|会执行右边的运算，而||不会执行右边的运算
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("我现在在北京");
        }else {
            System.out.println("我现在在南京");
        }
        System.out.println("num4 = " + num4);

        //开发中推荐使用短路运算符

        //练习：
        boolean x=true;
        boolean y=false;
        short z=42;
        if((z++==42)&&(y=true))z++;
        if((x=false) || (++z==45)) z++;
        System. out.println("z="+z);




    }
}
