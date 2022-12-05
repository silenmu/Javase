package day05;
/*
嵌套循环的应用：
1.九九乘法表

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
