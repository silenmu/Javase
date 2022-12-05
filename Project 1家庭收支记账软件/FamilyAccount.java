public class FamilyAccount {
    public static void main(String[] args){

        boolean isFlag = true;

        //初始金额
        int balance = 10000;
        //用于记录用户收入和支出的详情
        String details = "收支\t\t账户金额\t\t收支金额\t\t说明\n";
        //这里()也可以是false,只不过后面要加上break
        while(isFlag){

            System.out.println("--------------家庭收入记账软件--------------\n");
            System.out.println("                     1 收入明细");
            System.out.println("                     2 登记收入");
            System.out.println("                     3 登记支出");
            System.out.println("                     4 退出\n");
            System.out.print("                     请选择(1 - 4): ");
            //获取用户的选择:1-4
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    //System.out.println(" 1 收入明细");
                    System.out.println("--------------当前收支明细记录--------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------\n");
                    break;
                case '2':
                    //System.out.println("2 登记收入");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();

                    //处理balance
                    balance += money;

                    //处理details
                    details += ("收入\t\t" + balance + "\t\t" + money + "\t\t " + info + "\n");

                    System.out.println("------------------登记完成-----------------\n");
                    break;
                case '3':
                    //System.out.println("3 登记支出");
                    System.out.print("本次支出金额： ");
                    int money1 = Utility.readNumber();
                    System.out.print("本次支出说明： ");
                    String info1 = Utility.readString();

                    //处理balance
                    if (balance >= money1){
                        balance -= money1;
                        //处理details
                        details += ("支出\t\t" + balance + "\t\t" + money1 + "\t\t" + info1 + "\n");
                    }else {
                        System.out.println("支出超出账户额度，支付失败");
                    }


                    System.out.println("------------------登记完成-----------------\n");
                    break;
                case '4':
                    //System.out.println("4 退出");
                    System.out.print("确认是否退出(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }

                    //break;

            }

        }

    }


}
