package day04;/*
如何从键盘获取不同类型的变量：需要使用Scanner类

具体实现步骤：
1.导包：import java.util.Scanner
2.Scanner实例化：Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法，开获取指定类型的变量
 */
import java.util.Date;
import  java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        int num = scan.nextInt();
        System.out.println("请输入你的姓名： ");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄： ");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重： ");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了？(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        System.out.println("请输入你的性别：(男生/女)");
        String gender = scan.next();
        char genderChar = gender.charAt(1);
        System.out.println(genderChar);
    }
}
