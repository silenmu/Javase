package day04;/*      �κ���ϰ3
        �ҼҵĹ�5���ˣ�5��Ĺ��൱���������أ���ʵ����ǰ����ÿһ���൱�������10.5�֮꣬��ÿ����һ����������ꡣ��ô5��Ĺ�
        �൱��������������أ�Ӧ���ǣ�10.5 + 10.5 + 4 + 4 + 4 = 33��

 */
import java.util.Scanner;
public class IfExer2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("��������ҹ��������䣺 ");
        int dogAge = scan.nextInt();

        if(dogAge >= 0 && dogAge <= 2){
            System.out.println("��ҹ�����ʵ�Ѿ�" + dogAge * 10.5 + "������");
        } else if (dogAge > 2) {
            System.out.println("��ҹ�����ʵ�Ѿ�" + 2 * 10.5 + (dogAge - 2) * 4 + "������");
        }else {
            System.out.println("��ҹ�����û����");
        }

/*      �κ���ϰ4��
        ��λ�ȡһ���������10 - 99
 */
        int value = (int) (Math.random() * 90 + 10);//[0.0 - 1.0)-->[0.0 - 90.0)-->[10 - 100.0)-->[10 - 99);
        System.out.println(value);



    }
}
