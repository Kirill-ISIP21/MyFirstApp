package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class SamRab7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int result;

        System.out.println("Enter your age: ");
        int name = in.nextInt();
        result = year - name;

        System.out.printf("Your birth is "+result+" \n");
        in.close();
    }
}
