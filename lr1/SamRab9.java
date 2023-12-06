package lr1;

import java.util.Scanner;

public class SamRab9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Введите число: ");
        int num = in.nextInt();

        a = num - 1;
        b = num;
        c = num + 1;
        d = a*a+b*b+c*c+2*a*b+2*a*c+2*b*c;

        System.out.println(""+a+", "+b+", "+c+", "+d+"");
    }
}
