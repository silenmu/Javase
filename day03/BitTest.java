/*
�����֮�壺λ�����

���ۣ�
1.λ����������Ķ������͵ı���
2. << :��һ����Χ�ڣ�ÿ������һλ���൱��*2
3. >> :��һ����Χ�ڣ�ÿ������һλ���൱��/2

�����⣺���Ч��ʽ����2 * 8
���ۣ�2 << 3 �� 8 << 1
 */
public class BitTest {
    public static void main(String[] args){
        int i = 21;
        i = -21;

        System.out.println("i << 2 ��" + (i << 2));
        System.out.println("i << 3 ��" + (i << 3));
        System.out.println("i << 26 ��" + (i << 26));
        System.out.println("i << 27 ��" + (i << 27));//�Ｋ�ط�


        //��ϰ����������������ֵ
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + " ; num2 = " +num2);
        //��ʽһ:������ʱ����,�Ƽ�ʹ��
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

        //������:�ô�: ���ö�����ʱ����;
        //      ����: �� ��Ӳ������ܳ����洢��Χ;
        //           �� �о�����: ֻ�ܶ�����ֵ����ʹ��.
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
        //������: ʹ��λ�����
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1 = " + num1 + " ; num2 = " +num2);

    }
}
