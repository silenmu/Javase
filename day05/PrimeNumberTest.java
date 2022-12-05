package day05;
/*
100以内所有的质数的输出:(方法一)
质数：素数，只能被1和他本身的数相除,从2开始到这个数-1结束为止，都不能被这个数本身整除，最小的质数是2

 */
public class PrimeNumberTest {
    public static void main(String[] args){

        for (int i = 2; i <= 100; i++){//遍历100以内的自然数
            boolean isFlag = true;//标识器，标识i是否被j整除，一旦除尽，修改其值
            for (int j = 2; j < i; j++){//j: 被i除尽
                if(i % j == 0){//j被i除尽
                    isFlag = false;
                }
            }
            if (isFlag == true){
                System.out.print("质数为：" + i +"  ");
            }
            //重置isFlag
            //isFlag = true;

        }


    }

}
