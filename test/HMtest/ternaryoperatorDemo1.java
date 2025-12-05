package HMtest;

import java.util.Scanner;

public class ternaryoperatorDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        String max = number1 == number2 ? "相同" : "不同";
        System.out.println(max);
            sc.close();
    }
}
