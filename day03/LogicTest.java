/*
�����֮�����Ƚ������
& && | || ! ^

˵����
�߼�����������Ķ���boolean���͵ı���

 */


public class LogicTest {
    public static void main(String[] args){

        //���� & �� &&
        //��ͬ��1��& �� && ����������һ��
        //��ͬ��2�������������trueʱ�����߶���ִ���ұߵ�����
        //��ͬ��1�������������falseʱ��&��ִ���ұߵ����㣬��&&����ִ���ұߵ�����
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("�������ڱ���");
        }else {
            System.out.println("���������Ͼ�");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("�������ڱ���");
        }else {
            System.out.println("���������Ͼ�");
        }
        System.out.println("num2 = " + num2);



        //���� | �� ||
        //��ͬ��1��| �� || ����������һ��
        //��ͬ��2�������������falseʱ�����߶���ִ���ұߵ�����
        //��ͬ��1�������������tureʱ��|��ִ���ұߵ����㣬��||����ִ���ұߵ�����
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("�������ڱ���");
        }else {
            System.out.println("���������Ͼ�");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("�������ڱ���");
        }else {
            System.out.println("���������Ͼ�");
        }
        System.out.println("num4 = " + num4);

        //�������Ƽ�ʹ�ö�·�����

        //��ϰ��
        boolean x=true;
        boolean y=false;
        short z=42;
        if((z++==42)&&(y=true))z++;
        if((x=false) || (++z==45)) z++;
        System. out.println("z="+z);




    }
}
