package lr1;

import java.util.Scanner;

public class SamRab10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b;

        System.out.println("Введите число 1: ");
        int num1 = in.nextInt();

        System.out.println("Введите число 2: ");
        int num2 = in.nextInt();

        a = num1+num2;
        b = num1-num2;

        System.out.println("Сумма = "+a+", Разность = "+b+"");
    }
}
