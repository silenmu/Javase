package day05;
/*
1.循环结构的4要素
① 初始化条件
② 循环条件------>boolean类型
③ 循环体
④ 迭代条件
2.do-while循环结构：
①
do{
    ③;
    ④}
}while(④);

执行过程：①-->③-->④-->②-->③-->④-->②--------②

说明：
1.do-while循环至少执行一次循环体
2.在开发中使用for和while循环多一些

 */
public class DoWhileTest {
    public static void main(String[] args){

        //遍历100以内的偶数,并计算所有偶数的和及偶数的个数
        int num = 1;
        int sum = 0;
        int count = 0;
        do {
            if (num % 2 == 0){
                System.out.print(num + " ");
                sum += num;
                count++;
            }
            num++;
        }while (num <= 100);

        System.out.println("总和为： " + sum);
        System.out.println("个数为： " + count);
    }
}
