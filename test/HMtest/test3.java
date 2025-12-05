package HMtest;

import java.util.Scanner;
//逻辑运算符练习
public class test3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        boolean result = number1 == 6 || number2 == 6  || (number1 + number2) % 6 == 0;
        System.out.println(result);
        sc.close();
    }
    
}
