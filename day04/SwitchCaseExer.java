package day04;
/*
从键盘分别输入年、月、日，判断这一天是当年的第几天,考虑闰年

分支结构总结：(if-else和 switch-case)
1.凡是可以用switch-case的结构，都可以转化为if-else。反之，不成立。
2.既可以使用switch-case(同时，switch中表达式的取值不太多)，又可以使用if-else时，优先使用switch-case，因为switch-case执行效率更高。



 */
import java.util.Scanner;
public class SwitchCaseExer {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入year： ");
        int year = scan.nextInt();
        System.out.println("请输入month：");
        int month = scan.nextInt();
        System.out.println("请输入day： ");
        int day = scan.nextInt();

        int sumDays = 0;
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                //sumDays += 28;
                //加上判断这一年是否是闰年
                if ((year % 4 == 0 && (year & 100) != 0) || year % 400 == 0){
                    sumDays += 29;
                    System.out.println("这一年是闰年！");
                }else {
                    sumDays += 28;
                    System.out.println("这一年是平年！");
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println(year + "年" + month + "月" + day + "日" +"是这一年的第" + sumDays + "天" );

    }
}
