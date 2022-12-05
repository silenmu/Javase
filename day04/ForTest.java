package day04;
/*
for循环结构的使用
1.循环结构的4要素
① 初始化条件
② 循环条件------>boolean类型
③ 循环体
④ 迭代条件

2.for循环的结构
for( ① ; ②  ; ④ ){
    ③
}
执行过程：①--->②--->③--->④--->②--->③--->④........

 */

public class ForTest {
    public static void main(String[] args){
        //输入20个helloworld：
        for (int i = 1;i <=3;i++){
            System.out.println("hello world");
        }
        //i只在for循环内有效，出了就失效了

        //for的执行过程
        int num = 1;
        for (System.out.print('a');num <= 3;System.out.print('b'),num++){
            System.out.print('c');
        }
        System.out.println('\n');

        //遍历100以内的偶数,记录所有偶数的和
        int sum = 0;//记录偶数的和
        int count = 0;//记录偶数的个数
        for (int i = 1;i <= 100;i++){
            if(i % 2 == 0){
                System.out.print(i + "、");
                sum += i;
                count++;
            }
        }
        System.out.println("总和为： " + sum);
        System.out.println("个数为： " + count);

    }
}
