package day05;
/*
100�������е����������
������������ֻ�ܱ�1��������������,��2��ʼ�������-1����Ϊֹ�������ܱ������������������С��������2

 */
public class OptiPrimeNumberTest {
    public static void main(String[] args){

        int count = 0;
        //��ȡ��ǰʱ�䵽1970-01-01 00:00:00�����ڵĺ�����
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++){//����100000���ڵ���Ȼ��
            boolean isFlag = true;//��ʶ������ʶi�Ƿ�j������һ���������޸���ֵ

            //�Ż������Ա�������������Ȼ������Ч��,64millsec!!
            //for (int j = 2; j < i; j++){//j: ��i����
            for (int j = 2; j <= Math.sqrt(i); j++){//j: ��i����
                if(i % j == 0){//j��i����
                    isFlag = false;
                    break;//�Ż�һ��ֻ�Ա����Ƿ���������Ȼ����Ч���Ż�֮��1020millsec
                    //�Ż�֮ǰ��12830millsec
                }
            }
            if (isFlag == true){
                //System.out.print("����Ϊ��" + i +"  ");
                count++;
            }
            //����isFlag
            //isFlag = true;
        }
        System.out.println("�����ĸ����ǣ�" + count);
        long end = System.currentTimeMillis();
        System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));


    }

}
