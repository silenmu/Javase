package day05;
/*
break��continue�ؼ��ֵ�ʹ��
                    ʹ�÷�Χ                 ѭ���е����ã���ͬ�㣩            ��ͬ��
break               switch-case             ������ǰѭ����             �ؼ��ֺ��治������ִ�����
                    ѭ���ṹ��

continue            ѭ���ṹ��                ��������ѭ��               �ؼ��ֺ��治��ִ�����

 */


public class BreakContinueTest {
    public static void main(String[] args){
        long start =System.currentTimeMillis();


        for (int i = 1; i <= 10; i++){

            if (i % 4 == 0){
                //break;//123
                continue;//123567910
                //System.out.println("��ٻ�����ҹ�������");//���ֶ�û��ִ��

            }
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /***************************/
        label:for (int i =1; i <= 4; i++){
            for (int j = 1; j <= 10; j++){
                if (j % 4 == 0){
                    //break;//Ĭ�����������˹ؼ��ֵ������һ��
                    //continue;//Ĭ�Ͻ��������˹ؼ��ֵ������һ�����һ��
                    //break label;//����ָ����ʶ��һ��ѭ���ṹ
                    continue label;//����ָ����ʶ��һ��ѭ���ṹ�ĵ���ѭ��
                }
                System.out.print(j);
            }
            System.out.println();
        }
            System.out.println("\n");

        long end = System.currentTimeMillis();
        System.out.println("��������ʱ��Ϊ��" + (end - start));

    }
}
