package lr1;

import java.util.Scanner;

public class SamRab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input secndname: ");
        String secndname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input otchestvo: ");
        String otchestvo = in.nextLine();

        System.out.printf("Hello, %s  %s  %s ",secndname, name, otchestvo);
        in.close();
    }
}
