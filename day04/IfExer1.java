package day04;

public class IfExer1 {
    public static void main(String[] args) {

        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println(x + y);
//            System.out.println("atguigu");
         else//else�ͽ�ԭ��
            System.out.println("x is " + x);


        boolean b = true;
        //���д��if(b==false)�ܱ���ͨ��������ܣ�����ǣ�
        if(b = false)
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");




    }
}
