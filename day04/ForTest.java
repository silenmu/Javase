package day04;
/*
forѭ���ṹ��ʹ��
1.ѭ���ṹ��4Ҫ��
�� ��ʼ������
�� ѭ������------>boolean����
�� ѭ����
�� ��������

2.forѭ���Ľṹ
for( �� ; ��  ; �� ){
    ��
}
ִ�й��̣���--->��--->��--->��--->��--->��--->��........

 */

public class ForTest {
    public static void main(String[] args){
        //����20��helloworld��
        for (int i = 1;i <=3;i++){
            System.out.println("hello world");
        }
        //iֻ��forѭ������Ч�����˾�ʧЧ��

        //for��ִ�й���
        int num = 1;
        for (System.out.print('a');num <= 3;System.out.print('b'),num++){
            System.out.print('c');
        }
        System.out.println('\n');

        //����100���ڵ�ż��,��¼����ż���ĺ�
        int sum = 0;//��¼ż���ĺ�
        int count = 0;//��¼ż���ĸ���
        for (int i = 1;i <= 100;i++){
            if(i % 2 == 0){
                System.out.print(i + "��");
                sum += i;
                count++;
            }
        }
        System.out.println("�ܺ�Ϊ�� " + sum);
        System.out.println("����Ϊ�� " + count);

    }
}
