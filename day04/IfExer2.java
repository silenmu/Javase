package day04;/*      课后练习3
        我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗前两年每一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
        相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁

 */
import java.util.Scanner;
public class IfExer2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你家狗狗的年龄： ");
        int dogAge = scan.nextInt();

        if(dogAge >= 0 && dogAge <= 2){
            System.out.println("你家狗狗其实已经" + dogAge * 10.5 + "岁啦！");
        } else if (dogAge > 2) {
            System.out.println("你家狗狗其实已经" + 2 * 10.5 + (dogAge - 2) * 4 + "岁啦！");
        }else {
            System.out.println("你家狗狗还没出生");
        }

/*      课后练习4：
        如何获取一个随机数：10 - 99
 */
        int value = (int) (Math.random() * 90 + 10);//[0.0 - 1.0)-->[0.0 - 90.0)-->[10 - 100.0)-->[10 - 99);
        System.out.println(value);



    }
}
