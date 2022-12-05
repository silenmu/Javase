/*
变量的使用
1、java定义变量的格式：数据类型 变量名 = 变量值；

2、说明：
    ① 变量必须先声明、后使用
    ② 变量必须定义在作用域内，在作用域内，变量才是有效的，除了作用域，他就失效了
    ③ 同一个作用域内，不可以声明两个同名的变量
    ppt：
    Java中每个变量必须先声明，后使用
    使用变量名来访问这块区域的数据
    变量的作用域：其定义所在的一对{ }内
    变量只有在其作用域内才有效
    同一个作用域内，不能定义重名的变量
 */
    public class VariableTest {
            public static void main(String[] args){
                int myAge = 12;
                System.out.println(myAge);

                //编译错误：在使用int myNumber之前并未定义过；
                //System.out.println(myNumber);
                int myNumber;
                //编译错误：在使用int myNumber之前并未赋值过；
                //System.out.println(myNumber);
                myNumber=1001;
                System.out.println(myNumber);

                //编译错误：method未被定义作用域内；
//               System.out.println(methed);
                //不可以在一个作用域定义多个同名的变量
                //int myAge = 22;
            }
//            public void methed(){
//                int myClass = 1;
//            }


}
