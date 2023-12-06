package lr1;

import java.util.Scanner;

public class SamRab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name day of week: ");
        String namedw = in.nextLine();

        System.out.println("Input name of month: ");
        String name = in.nextLine();

        System.out.println("Input height: ");
        int numdm = in.nextInt();

        System.out.printf("Today is %s %s, %s  \n",numdm, name, namedw);
        in.close();
    }
}
