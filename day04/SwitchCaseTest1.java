package day04;
/*
2.��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�

˵����
�� switch-case������ִ�������ͬ�������ֱ�Ӻϲ�����ʵ�����û��break���������ͬ��
�� ��������60��á�
 */
import java.util.Scanner;
public class SwitchCaseTest1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("��������ĳɼ��� ");
        int score = input.nextInt() / 10;

        System.out.println("��������ĳɼ��� ");

        switch (score){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("������");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("����");
                break;

        }

    }
}
