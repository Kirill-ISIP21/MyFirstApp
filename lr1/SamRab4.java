package lr1;

import java.util.Scanner;

public class SamRab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name of month: ");
        String name = in.nextLine();

        System.out.println("How many days in month: ");
        int num = in.nextInt();

        System.out.printf("In %s %s days \n",name, num);
        in.close();
    }
}
