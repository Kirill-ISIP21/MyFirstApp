package lr1;

import java.util.Scanner;

public class SamRab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name:");
        String name = in.nextLine();

        System.out.println("Input your age:");
        int age = in.nextInt();

        System.out.printf("Your name is %s, your age is %d " ,name, age);

        in.close();
    }
}
