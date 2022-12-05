package day04;
/*
�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���,��������

��֧�ṹ�ܽ᣺(if-else�� switch-case)
1.���ǿ�����switch-case�Ľṹ��������ת��Ϊif-else����֮����������
2.�ȿ���ʹ��switch-case(ͬʱ��switch�б��ʽ��ȡֵ��̫��)���ֿ���ʹ��if-elseʱ������ʹ��switch-case����Ϊswitch-caseִ��Ч�ʸ��ߡ�



 */
import java.util.Scanner;
public class SwitchCaseExer {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("������year�� ");
        int year = scan.nextInt();
        System.out.println("������month��");
        int month = scan.nextInt();
        System.out.println("������day�� ");
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
                //�����ж���һ���Ƿ�������
                if ((year % 4 == 0 && (year & 100) != 0) || year % 400 == 0){
                    sumDays += 29;
                    System.out.println("��һ�������꣡");
                }else {
                    sumDays += 28;
                    System.out.println("��һ����ƽ�꣡");
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println(year + "��" + month + "��" + day + "��" +"����һ��ĵ�" + sumDays + "��" );

    }
}
