/*
练习一：
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断

说明：
① else是可选的
② 由于if-else结构是执行之后即跳出的；所以：
 > 对于多个表达式是互斥的关系（没有交集），哪一个判断执行语句放在上面无所谓；
 > 对于多个表达式是有交集的关系，需要根据实际情况，考虑清楚那个结构声明在上面；
 > 对于多个表达式有包含关系，通常情况下，将范围小的放在上面，否则范围小的就没机会执行。

 */

import java.util.Scanner;
public class IfTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入岳小鹏的成绩：(0 - 100)");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("奖励一台BMW");
        } else if (score > 80 && score <= 90) {
            System.out.println("奖励一台iphone 14promax");
        } else if (score > 80 && score <= 90) {
            System.out.println("奖励一台iphone 14promax");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励一台ipad");
        } else {
            System.out.println("什么奖励都么有！");
        }

    }
}
