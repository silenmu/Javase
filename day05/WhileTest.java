package day05;
/*
While循环的使用

1.循环结构的4要素
① 初始化条件
② 循环条件------>boolean类型
③ 循环体
④ 迭代条件

2.while循环的结构
①
while(②){
③;
④；
}
执行过程：①--->②--->③--->④--->②--->③--->④........-②（false）
说明：
Ⅰ. 写while循环千万不要丢了迭代条件，一旦丢了，程序就会导致死循环！
Ⅱ. 避免出现死循环，要遵循算法的 ： 有限性！
Ⅲ. for循环和while循环可以相互转化
    区别：两种循环的初始化条件部分的作用范围不同
 */

public class WhileTest {
    public static void main(String[] args){

        //遍历100以内的所有偶数
        int i = 2;
        while (i <= 100){
            if (i % 2 ==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
