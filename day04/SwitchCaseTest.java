package day04;
/*
��֧�ṹ֮��:switch-case:
��ʽ��
switch(���ʽ){
case ����1��
    ִ�����1;
    //break;

case ����2��
    ִ�����2;
    //break;
...
default:
    ִ�����n;
    //break;
    }

˵����
�� ����switch���ʽ�е�ֵ������ƥ�����case�еĳ��� ��һ��ƥ��ɹ����������Ӧ��case�ṹ�У�������ִ����䡣
   ��������ִ�����֮�󣬼�������ִ������case�ṹ�е�ִ����䣬֪������break�ؼ��ֻ��ߵ�switch-case�ṹĩβ������
�� ����break���֮��ֱ������switch-case�ṹ��
�� switch-case�ṹ�еı��ʽֻ��������6���������ͣ�
        byte��short��char��int��ö�����͡�String���ͣ�������Boolean���ͣ���
�� case֮��ֻ���ǳ����������Ƿ�Χ��
�� break�ǿ�ѡ�ġ�
�� default�൱��if-else�ṹ�е�else��Ҳ�ǿ�ѡ�ġ�

 */
public class SwitchCaseTest {
    public static void main(String[] args){

        int num = 2;
        switch (num){
            case 0 :
                System.out.println("zero");
                break;
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            default:
                System.out.println("other");


        }

    }
}
