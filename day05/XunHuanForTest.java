package day05;
/*
˵����
�� �ڲ�ѭ���ṹ����һ�飬�൱�����ѭ��ѭ����ִ��һ��
�� �������ѭ����Ҫִ��m�Σ��ڲ�ѭ����Ҫִ��n�Σ���ʱ���ڲ�ѭ����ѭ����һ��ִ����m*n��

���ɣ�
�� ���ѭ�������������ڲ�ѭ����������

 */

public class XunHuanForTest {
    public static void main(String[] args){
        //%%%%%%
        for (int i =1; i <= 6; i++){
            System.out.print("%");
        }
            System.out.println("\n");

        //******���8��
        for(int j = 1; j <= 8; j++){
            for(int i = 1; i <= 6; i++ ){
                System.out.print('*');
            }
            System.out.println();
        }
             System.out.println("\n");

        //б������ 8��
        for (int i  = 1; i <= 8; i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("\n");

        //б�������� 8��
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 9-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
