package day05;
/*
100�������е����������:(����һ)
������������ֻ�ܱ�1��������������,��2��ʼ�������-1����Ϊֹ�������ܱ������������������С��������2

 */
public class PrimeNumberTest {
    public static void main(String[] args){

        for (int i = 2; i <= 100; i++){//����100���ڵ���Ȼ��
            boolean isFlag = true;//��ʶ������ʶi�Ƿ�j������һ���������޸���ֵ
            for (int j = 2; j < i; j++){//j: ��i����
                if(i % j == 0){//j��i����
                    isFlag = false;
                }
            }
            if (isFlag == true){
                System.out.print("����Ϊ��" + i +"  ");
            }
            //����isFlag
            //isFlag = true;

        }


    }

}
