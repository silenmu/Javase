package day04;/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��Scanner��

����ʵ�ֲ��裺
1.������import java.util.Scanner
2.Scannerʵ������Scanner scan = new Scanner(System.in);
3.����Scanner�����ط���������ȡָ�����͵ı���
 */
import java.util.Date;
import  java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        int num = scan.nextInt();
        System.out.println("��������������� ");
        String name = scan.next();
        System.out.println(name);

        System.out.println("��������ķ��䣺 ");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("������������أ� ");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("���Ƿ��������ˣ�(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        System.out.println("����������Ա�(����/Ů)");
        String gender = scan.next();
        char genderChar = gender.charAt(1);
        System.out.println(genderChar);
    }
}
