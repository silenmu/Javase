package day05;
/*
说明：
① 内层循环结构遍历一遍，相当于外层循环循环体执行一次
② 假设外层循环需要执行m次，内层循环需要执行n次，此时，内层循环的循环体一共执行了m*n次

技巧：
① 外层循环控制行数，内层循环控制列数

 */

public class XunHuanForTest {
    public static void main(String[] args){
        //%%%%%%
        for (int i =1; i <= 6; i++){
            System.out.print("%");
        }
            System.out.println("\n");

        //******输出8行
        for(int j = 1; j <= 8; j++){
            for(int i = 1; i <= 6; i++ ){
                System.out.print('*');
            }
            System.out.println();
        }
             System.out.println("\n");

        //斜金字塔 8行
        for (int i  = 1; i <= 8; i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("\n");

        //斜倒金字塔 8行
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 9-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
