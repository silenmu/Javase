package day05;
/*
Ƕ��ѭ����Ӧ�ã�
1.�žų˷���

 */
public class NineNIneTable {
    public static void main(String[] args){

        for (int i = 1; i <= 19; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" +(i * j) + " ");
            }
            System.out.println();
        }


    }
}
