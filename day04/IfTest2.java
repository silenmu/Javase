package day04;/*
if-else ��ϰ2��
��д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������

˵����
�� if-else�ṹ�ǿ����໥Ƕ�׵ģ�������ʵ�ʿ��������У�һ�㲻����3��
�� ���ִ�����ṹֻ��һ�㣬{}����ʡ�ԣ��������ڿ�����ʡ��

 */
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("�������һ�������� ");
        int num1 = scan.nextInt();
        System.out.println("������ڶ��������� ");
        int num2 = scan.nextInt();
        System.out.println("����������������� ");
        int num3 = scan.nextInt();

        if(num1 >= num2){
            if(num3 >= num1){
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 >= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else{
                System.out.println(num2 + "," +num3 + "," + num1);
            }
        }else {
            if (num3 >= num2){
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            }else {
                System.out.println(num1 + "," + num2 + "," + num3);
            }
        }
    }
}
