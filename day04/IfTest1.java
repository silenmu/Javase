/*
��ϰһ��
��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ��
�����
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone xs max��
���ɼ�Ϊ[60,80]ʱ������һ�� iPad��
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�

˵����
�� else�ǿ�ѡ��
�� ����if-else�ṹ��ִ��֮�������ģ����ԣ�
 > ���ڶ�����ʽ�ǻ���Ĺ�ϵ��û�н���������һ���ж�ִ����������������ν��
 > ���ڶ�����ʽ���н����Ĺ�ϵ����Ҫ����ʵ���������������Ǹ��ṹ���������棻
 > ���ڶ�����ʽ�а�����ϵ��ͨ������£�����ΧС�ķ������棬����ΧС�ľ�û����ִ�С�

 */

import java.util.Scanner;
public class IfTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("��������С���ĳɼ���(0 - 100)");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("����һ̨BMW");
        } else if (score > 80 && score <= 90) {
            System.out.println("����һ̨iphone 14promax");
        } else if (score > 80 && score <= 90) {
            System.out.println("����һ̨iphone 14promax");
        } else if (score >= 60 && score <= 80) {
            System.out.println("����һ̨ipad");
        } else {
            System.out.println("ʲô������ô�У�");
        }

    }
}
