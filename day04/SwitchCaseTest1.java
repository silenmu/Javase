package day04;
/*
2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

说明：
① switch-case如果多个执行语句相同，则可以直接合并，其实这个和没有break那种情况相同。
② 这道题除以60最好。
 */
import java.util.Scanner;
public class SwitchCaseTest1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩： ");
        int score = input.nextInt() / 10;

        System.out.println("请输入你的成绩： ");

        switch (score){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;

        }

    }
}
