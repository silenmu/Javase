package day05;
/*
break和continue关键字的使用
                    使用范围                 循环中的作用（相同点）            不同点
break               switch-case             结束当前循环，             关键字后面不能声明执行语句
                    循环结构中

continue            循环结构中                结束当此循环               关键字后面不能执行语句

 */


public class BreakContinueTest {
    public static void main(String[] args){
        long start =System.currentTimeMillis();


        for (int i = 1; i <= 10; i++){

            if (i % 4 == 0){
                //break;//123
                continue;//123567910
                //System.out.println("孟倩在想我哈哈哈！");//两种都没有执行

            }
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /***************************/
        label:for (int i =1; i <= 4; i++){
            for (int j = 1; j <= 10; j++){
                if (j % 4 == 0){
                    //break;//默认跳出包裹此关键字的最近的一层
                    //continue;//默认结束包裹此关键字的最近的一层的这一次
                    //break label;//结束指定标识的一层循环结构
                    continue label;//结束指定标识的一层循环结构的当此循环
                }
                System.out.print(j);
            }
            System.out.println();
        }
            System.out.println("\n");

        long end = System.currentTimeMillis();
        System.out.println("程序运行时间为：" + (end - start));

    }
}
