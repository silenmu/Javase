package Word;
/*
һ.if-else��ϰ
1.��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�����score��ֵ������Ӧ�ĳɼ��ȼ���
score>=90           �ȼ���A
70=<score<90        �ȼ���B
60=<score<70        �ȼ���C
score<60            �ȼ���D

��. switch��ϰ
1.����ָ���·ݣ���ӡ���·������ļ��ڡ�3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����


 */


import java.util.Scanner;
public class BranchTest {
    public static void main(String[] args){
        //һ

        Scanner input = new Scanner(System.in);

        System.out.println("��������ĳɼ��� ");
        int score = input.nextInt();

        if(score >= 90){
            System.out.println("�ȼ�A��");
        } else if (score >= 70 && score < 90) {
            System.out.println("�ȼ�B!");
        } else if (score >= 60 && score < 70) {
            System.out.println("�ȼ�C��");
        } else {
            System.out.println("�ȼ�D");
        }

        //��
        Scanner input1 = new Scanner(System.in);

        System.out.println("�����뵱ǰ���·�");
        int month = input1.nextInt();

        switch (month){

        }

    }



}

