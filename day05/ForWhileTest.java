/*
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������
Ϊ0ʱ��������


˵����
1.����ѭ�������������ƴ����Ľṹ��while(true)��fo( ; ; )
2.����ѭ�����������ַ�ʽ��
    ����һ��ѭ���������ַ���false��
    ����������ѭ�����У�ִ��break��
 */

package day05;
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;

        for ( ; ; ){
        // while (true){
            System.out.println("���������֣� ");
            int num = scan.nextInt();

            //�ж�num���������
            if(num > 0){
                positiveNum++;
            } else if (num <0 ) {
                negativeNum++;
            }else {
                //һ��ִ��break������ѭ��
                break;
            }
        }
        System.out.println("�����ĸ����ǣ� " + positiveNum);
        System.out.println("�����ĸ����ǣ� " + negativeNum);


    }
}
