package lr1;

import java.util.Scanner;

public class SamRab8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int result;

        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.println("Введите второе число:");
        int num2 = in.nextInt();

        result = num1 + num2;

        System.out.println("Ответ, сумма чисел = "+result+"");
    }
}
