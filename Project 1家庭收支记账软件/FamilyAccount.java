public class FamilyAccount {
    public static void main(String[] args){

        boolean isFlag = true;

        //��ʼ���
        int balance = 10000;
        //���ڼ�¼�û������֧��������
        String details = "��֧\t\t�˻����\t\t��֧���\t\t˵��\n";
        //����()Ҳ������false,ֻ��������Ҫ����break
        while(isFlag){

            System.out.println("--------------��ͥ����������--------------\n");
            System.out.println("                     1 ������ϸ");
            System.out.println("                     2 �Ǽ�����");
            System.out.println("                     3 �Ǽ�֧��");
            System.out.println("                     4 �˳�\n");
            System.out.print("                     ��ѡ��(1 - 4): ");
            //��ȡ�û���ѡ��:1-4
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    //System.out.println(" 1 ������ϸ");
                    System.out.println("--------------��ǰ��֧��ϸ��¼--------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------\n");
                    break;
                case '2':
                    //System.out.println("2 �Ǽ�����");
                    System.out.print("���������");
                    int money = Utility.readNumber();
                    System.out.print("��������˵����");
                    String info = Utility.readString();

                    //����balance
                    balance += money;

                    //����details
                    details += ("����\t\t" + balance + "\t\t" + money + "\t\t " + info + "\n");

                    System.out.println("------------------�Ǽ����-----------------\n");
                    break;
                case '3':
                    //System.out.println("3 �Ǽ�֧��");
                    System.out.print("����֧���� ");
                    int money1 = Utility.readNumber();
                    System.out.print("����֧��˵���� ");
                    String info1 = Utility.readString();

                    //����balance
                    if (balance >= money1){
                        balance -= money1;
                        //����details
                        details += ("֧��\t\t" + balance + "\t\t" + money1 + "\t\t" + info1 + "\n");
                    }else {
                        System.out.println("֧�������˻���ȣ�֧��ʧ��");
                    }


                    System.out.println("------------------�Ǽ����-----------------\n");
                    break;
                case '4':
                    //System.out.println("4 �˳�");
                    System.out.print("ȷ���Ƿ��˳�(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }

                    //break;

            }

        }

    }


}
