/*
������������֮����������
ǰ�᣺����ֻ���۳��˲������͵�7���������͡�
1���Զ�����������
    ���ۣ�������С���������ͺ����������������������ʱ������Զ�����Ϊ����������ͣ�
    ˵������ʱ������С��ָ���ķ�Χ��С�����磺float��������long������������ռ���ڴ��С��
        byte��short��char --> int --> long --> float --> double ;
        �ر�ģ��� byte ��short ��char ���ֱ���������ʱ�����ת����int�ͼ��������͡�

2��ǿ������ת��:��һclass

 */

public class VariableTest2 {
    public static void main(String[] args){
        byte b1 = 2;
        int i1 = 128;
        //���벻ͨ��;
        //byte b2 = b1 + i1;
        int i2 = b1 + i1;
        System.out.println(i2);

        float f1 = b1 + i2;
        System.out.println(f1);

        /**
        short s11 = 11;
        byte b11 = 22;
        long l11 = b11+s11;
        System.out.println(l11);
        **/

        /**********************
        //˵�� int -- > char
        char c1 = 'a';//97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        //˵�� char������ short��byte
        short s2 = 10;
       // char c2 = c1 + s2;//����ʧ��
        System.out.println(c2);

        byte b2 = 10;
       // short s4 = b1 + b2;//����ʧ��
         **********************/

    }
}
