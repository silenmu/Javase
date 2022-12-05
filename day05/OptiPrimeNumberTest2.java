package day05;
/*
100以内所有的质数的输出(方法二)
质数：素数，只能被1和他本身的数相除,从2开始到这个数-1结束为止，都不能被这个数本身整除，最小的质数是2

 */
public class OptiPrimeNumberTest2 {
    public static void main(String[] args){

        int count = 0;
        //获取当前时间到1970-01-01 00:00:00到现在的毫秒数
        long start = System.currentTimeMillis();
        label:for (int i = 2; i <= 100000; i++){//遍历100000以内的自然数
             for (int j = 2; j <= Math.sqrt(i); j++){//j: 被i除尽
                if(i % j == 0){//j被i除尽
                  continue label;
                }
            }
             //能执行到此步骤的都是质数
             count++;
        }
        System.out.println("质数的个数是：" + count);
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));//14


    }

}
