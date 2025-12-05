package IFdemo;

import java.util.Scanner;

public class IFdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int a = sc.nextInt();
        if (a > 2){
                System.out.println("给出回应");
        }
        else
            {
                System.out.println("不做出回应");
            }
        
        sc.close();
    }
    
}
