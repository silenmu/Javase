/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
为0时结束程序。


说明：
1.不在循环条件部份限制次数的结构：while(true)和fo( ; ; )
2.结束循环有下面两种方式：
    方法一：循环条件部分返回false；
    方法二：在循环体中，执行break。
 */

package day05;
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;

        for ( ; ; ){
        // while (true){
            System.out.println("请输入数字： ");
            int num = scan.nextInt();

            //判断num的正负情况
            if(num > 0){
                positiveNum++;
            } else if (num <0 ) {
                negativeNum++;
            }else {
                //一旦执行break，跳出循环
                break;
            }
        }
        System.out.println("正数的个数是： " + positiveNum);
        System.out.println("负数的个数是： " + negativeNum);


    }
}
