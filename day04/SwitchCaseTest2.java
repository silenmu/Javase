package day04;
/*
从键盘分别输入年、月、日，判断这一天是当年的第几天,考虑闰年

 */
import java.util.Scanner;
public class SwitchCaseTest2 {
    public static void main(String[] args){
        //方法一：if-else法，比较冗余
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入2022年的month：");
        int month = scan.nextInt();
        System.out.println("请输入2022年的day： ");
        int day = scan.nextInt();

        //定义一个变量来保存总天数
        int sumDays = 0;
//        if(month == 1){
//            sumDays = day;
//        } else if (month == 2) {
//            sumDays = 31 + day;
//        } else if (month == 3) {
//            sumDays = 31 + 28 + day;
//        }
        //......


        //方式二：冗余
//        switch (month){
//            case 1:
//                sumDays = day;
//                break;
//            case 2:
//                sumDays = 31 + day;
//                break;
//        }
        //......
        //方法三：利用无break的switch-case的特点，到这写
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
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println("2022年" + month + day +"是这一年的第" + sumDays + "天" );

    }
}
