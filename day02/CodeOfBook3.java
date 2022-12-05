/*
1.对浮点数进行四舍五入

 */



public class CodeOfBook3 {
    public static void main(String[] args){
        //1.1 截断操作
        double x = 9.997;
        int nx1 = (int) x;
        //1.2 四舍五入操作
        int nx2 = (int) Math.round(x);//round方法返回的是long型，可能存在信息丢失
        System.out.println(nx1+'\n');
        System.out.println(nx2);
    }
}
