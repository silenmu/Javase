package day04;
/*
�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���,��������

 */
import java.util.Scanner;
public class SwitchCaseTest2 {
    public static void main(String[] args){
        //����һ��if-else�����Ƚ�����
        Scanner scan = new Scanner(System.in);

        System.out.println("������2022���month��");
        int month = scan.nextInt();
        System.out.println("������2022���day�� ");
        int day = scan.nextInt();

        //����һ������������������
        int sumDays = 0;
//        if(month == 1){
//            sumDays = day;
//        } else if (month == 2) {
//            sumDays = 31 + day;
//        } else if (month == 3) {
//            sumDays = 31 + 28 + day;
//        }
        //......


        //��ʽ��������
//        switch (month){
//            case 1:
//                sumDays = day;
//                break;
//            case 2:
//                sumDays = 31 + day;
//                break;
//        }
        //......
        //��������������break��switch-case���ص㣬����д
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
        System.out.println("2022��" + month + day +"����һ��ĵ�" + sumDays + "��" );

    }
}
