package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class SamRab6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your birth year: ");
        myyear = in.nextInt();
        result = year - myyear;

        System.out.printf("Your name "+name+", your age is "+result+" \n");
        in.close();

    }
}
