/*
java�������������
һ���������������������֣�

    ������������;
        ����: byte \ short \ int \ long;
        �����ͣ� float \ double;
        �ַ��ͣ� char;
        �����ͣ� boolean;

     ������������;
        �� class
        �ӿ� interface
        ���� array
�����������������е�λ�ã�
    ��Ա���� vs �ֲ�����
 */



class VariableTest1 {
    public static void main(String[] args){
        //1.����: byte(1�ֽ� = 8 bit) \ short(2�ֽ�) \ int(4 �ֽ�) \ long(8�ֽ�);
        // �� byte ��Χ: -128 ~ 127;
        byte b1 = 2;
        byte b2 = -128;
        //byte b3 = 128;

        System.out.println(b1);
        System.out.println(b2);
//        System.out.println(b3);

        // �� ����long �ͱ�����������'l'��'L' ��β��
        // �� ͨ���������ͱ���ʱ��ʹ��int�ͣ�
        short l1 = 128;
        int l2 = 1234;
        long l3 = 263781264l;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        //2.�����ͣ�float(4�ֽ�)\ double(8�ֽ�)��
        //�� �����ͣ���ʾ��С�����ֵ��
        //�� float��ʾ��ֵ�ķ�Χ��long����
        double d1 = 123.4;
        System.out.println(d1);
        //�� ����float���ͱ���ʱ��Ҫ����ֵĩβ���ϡ�f����'F';
//        float f1 = 12.345;
        float f2 = 12.34F;
        System.out.println(f2);
        // �� ͨ��ʹ�� double ;

        //3.�ַ��ͣ� char(1�ַ� = 2�ֽ�);
        //�� ����char���ͣ�ͨ��ʹ��һ��'';
        char c1 = 'a';
        char c2 = '��';
        char c3 = '��';
        //ֻ����1�ַ�����Ȼ�ᱨ��
        //c1 = AB;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //�� ��ʾ��ʽ����.����һ���ַ� ��.ת���ַ� ��.ʹ��Unicode���ʾ�ַ��ͳ���
        char c5 = '\n';
        c5 = '\t';//'\t' �൱��tab��
        System.out.print("hello" + c5);
        System.out.println("world");
        char c6 = '\u0043';
        System.out.println(c6);

        //�����ͣ� boolean;
        //�� ֻ��ȡ����ֵ��true��false
        //�� ������ѭ���ṹ�������ж�ʱʹ��
        boolean bb1 = true;
        System.out.println(bb1);
        boolean isMarried = false;
        if(isMarried){
            System.out.println("����Զ�̸̸Ů����");
        }else {
            System.out.println("��Ͳ��ܲμ�\"����\"�ۻ�!\\n���ź�");
        }
    }
}
