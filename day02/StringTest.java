/*
Srting���ͱ�����ʹ��
1.String��������������������
2.����String����ʱ��Ҫ��һ�ѡ���
3.String���Ϳ�����8�ֻ������������㣬��ֻ�����������㣺+
4.��������Ȼ��String


 */

public class StringTest {
    public static void main(String[] args){
        String s1 = "Hello World!";
        System.out.println(s1);
        String s2 = "a";
        String s3 = "";
//        char c = "";//char��������Ҫ������
//        char c1 =" ";//Ҳ�����ǿո�
        System.out.println(s2);
        System.out.println(s3);

        //************************
        int number = 180103256;
        String numberStr = "ѧ�ţ�";
        String info = numberStr + number;
        System.out.println(info);

        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);

        //************************
        //��ϰ1
        char c ='a';//97 A:65
        int num = 10;
        String str = "hello";
        System.out.println(c + num +str);
        System.out.println(c + str +num);
        System.out.println(c + (num +str));
        System.out.println((c + num) +str);
        System.out.println(str + num +c);
        /*107hello
        ahello10
        a10hello
        107hello
        hello10a*/

        //��ϰ2
        //�����*  *
        System.out.println("*       *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));

    }
}
