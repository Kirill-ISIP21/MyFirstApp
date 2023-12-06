package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class SamRab5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;

        System.out.print("Enter your birth year: ");
        myyear = in.nextInt();
        result = year - myyear;

        System.out.println("You are "+result+"year/s old.");
    }
}
