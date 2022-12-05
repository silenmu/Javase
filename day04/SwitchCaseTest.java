package day04;
/*
分支结构之二:switch-case:
格式：
switch(表达式){
case 常量1：
    执行语句1;
    //break;

case 常量2：
    执行语句2;
    //break;
...
default:
    执行语句n;
    //break;
    }

说明：
① 根据switch表达式中的值，依次匹配各个case中的常量 ，一旦匹配成功，则进入相应的case结构中，调用其执行语句。
   当调用完执行语句之后，继续向下执行其他case结构中的执行语句，知道遇到break关键字或者到switch-case结构末尾结束。
② 遇到break语句之后，直接跳出switch-case结构。
③ switch-case结构中的表达式只能是如下6中数据类型：
        byte、short、char、int、枚举类型、String类型，不能是Boolean类型！！
④ case之后只能是常量，不能是范围。
⑤ break是可选的。
⑥ default相当于if-else结构中的else。也是可选的。

 */
public class SwitchCaseTest {
    public static void main(String[] args){

        int num = 2;
        switch (num){
            case 0 :
                System.out.println("zero");
                break;
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            default:
                System.out.println("other");


        }

    }
}
