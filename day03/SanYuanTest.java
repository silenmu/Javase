/*
�����֮������Ԫ�����
1.�ṹ��(�������ʽ)�����ʽ1:���ʽ2
2.˵����
�� �������ʽ�Ľ��Ϊboolean����
�� ������ʽΪture����ִ�б��ʽ1;��֮��ִ�б��ʽ2
�� ���ʽ1�ͱ��ʽ2Ҫ��ͳһΪһ������
�� ��Ԫ���������Ƕ��ʹ��
3.����ʹ����Ԫ������ĵط�������ʹ��if-else�ṹ����֮��������
4.��Ԫ���������if-elseЧ�ʸ��ߡ����
 */
public class SanYuanTest {
    public static void main(String[] args){

        //��ȡ���������Ľϴ�ֵ
        int m = 12;
        int n = 5;

        int max = (m > n)?m : n;
        System.out.println(max);

        double max1 = (m > n)? 2 : 1.0;
        System.out.println(max1);

        //û��ͳһ
        //(m > n)?2 : "n��";//�������
        String maxStr = (m >n ) ? "m��" : "n��";
        System.out.println(maxStr);

        m = 5;
        String maxStr1 = (m > n) ? "m��" : ((m == n) ? "m �� n ���" : "n��");
        System.out.println(maxStr1);


        //��ȡ�����������ֵ
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max11 = (n1 > n2) ? n1 : n2;
        int max2 = (max11 > n3) ? max11 : n3;
        System.out.println("�����������ֵΪ �� " + max2);//�Ƽ�

        int max3 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println("�����������ֵΪ �� " + max3);



    }
}
