package day05;
/*
1.ѭ���ṹ��4Ҫ��
�� ��ʼ������
�� ѭ������------>boolean����
�� ѭ����
�� ��������
2.do-whileѭ���ṹ��
��
do{
    ��;
    ��}
}while(��);

ִ�й��̣���-->��-->��-->��-->��-->��-->��--------��

˵����
1.do-whileѭ������ִ��һ��ѭ����
2.�ڿ�����ʹ��for��whileѭ����һЩ

 */
public class DoWhileTest {
    public static void main(String[] args){

        //����100���ڵ�ż��,����������ż���ĺͼ�ż���ĸ���
        int num = 1;
        int sum = 0;
        int count = 0;
        do {
            if (num % 2 == 0){
                System.out.print(num + " ");
                sum += num;
                count++;
            }
            num++;
        }while (num <= 100);

        System.out.println("�ܺ�Ϊ�� " + sum);
        System.out.println("����Ϊ�� " + count);
    }
}
