package day05;
/*
100�������е����������(������)
������������ֻ�ܱ�1��������������,��2��ʼ�������-1����Ϊֹ�������ܱ������������������С��������2

 */
public class OptiPrimeNumberTest2 {
    public static void main(String[] args){

        int count = 0;
        //��ȡ��ǰʱ�䵽1970-01-01 00:00:00�����ڵĺ�����
        long start = System.currentTimeMillis();
        label:for (int i = 2; i <= 100000; i++){//����100000���ڵ���Ȼ��
             for (int j = 2; j <= Math.sqrt(i); j++){//j: ��i����
                if(i % j == 0){//j��i����
                  continue label;
                }
            }
             //��ִ�е��˲���Ķ�������
             count++;
        }
        System.out.println("�����ĸ����ǣ�" + count);
        long end = System.currentTimeMillis();
        System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));//14


    }

}
