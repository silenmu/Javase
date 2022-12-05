package day05;
/*
100以内所有的质数的输出
质数：素数，只能被1和他本身的数相除,从2开始到这个数-1结束为止，都不能被这个数本身整除，最小的质数是2

 */
public class OptiPrimeNumberTest {
    public static void main(String[] args){

        int count = 0;
        //获取当前时间到1970-01-01 00:00:00到现在的毫秒数
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++){//遍历100000以内的自然数
            boolean isFlag = true;//标识器，标识i是否被j整除，一旦除尽，修改其值

            //优化二：对本身是质数的自然数是有效的,64millsec!!
            //for (int j = 2; j < i; j++){//j: 被i除尽
            for (int j = 2; j <= Math.sqrt(i); j++){//j: 被i除尽
                if(i % j == 0){//j被i除尽
                    isFlag = false;
                    break;//优化一：只对本身是非质数的自然数有效，优化之后：1020millsec
                    //优化之前：12830millsec
                }
            }
            if (isFlag == true){
                //System.out.print("质数为：" + i +"  ");
                count++;
            }
            //重置isFlag
            //isFlag = true;
        }
        System.out.println("质数的个数是：" + count);
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));


    }

}
