package Word;
/*
一.if-else练习
1.编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
score>=90           等级：A
70=<score<90        等级：B
60=<score<70        等级：C
score<60            等级：D

二. switch练习
1.根据指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季


 */


import java.util.Scanner;
public class BranchTest {
    public static void main(String[] args){
        //一

        Scanner input = new Scanner(System.in);

        System.out.println("请输入你的成绩： ");
        int score = input.nextInt();

        if(score >= 90){
            System.out.println("等级A！");
        } else if (score >= 70 && score < 90) {
            System.out.println("等级B!");
        } else if (score >= 60 && score < 70) {
            System.out.println("等级C！");
        } else {
            System.out.println("等级D");
        }

        //二
        Scanner input1 = new Scanner(System.in);

        System.out.println("请输入当前的月份");
        int month = input1.nextInt();

        switch (month){

        }

    }



}

