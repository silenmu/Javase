
/*��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���
һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
? �������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
? �������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
? ������������������㣬�򣺡����ޣ�

 */
package day04;
import java.util.Scanner;
public class IfExerc1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("�����������ߣ� ��cm��");
        int height = scan.nextInt();
        System.out.println("��������ĲƸ��� ��qw��");
        double weight = scan.nextDouble();
        System.out.println("���������Ƿ񳤵�˧�� ��Y/N��");
//        boolean isHeadsome = scan.nextBoolean();

        String isHeadsome = scan.next();

        if(height >= 180 && weight >= 1 && isHeadsome.equals("Y")){
            System.out.println("��һ��Ҫ�޸���!!!");
        } else if (height >= 180 || weight >= 1 || isHeadsome.equals("y")) {
            System.out.println("�ްɣ����ϲ��㣬��������");
        }else {
            System.out.println("����!");
        }

    }
}
