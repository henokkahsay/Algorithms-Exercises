package FromYouTube;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class Largest_factor_number {

    public static void main(String[] args) {
        System.out.println(fun1(-145555));
    }

    public static int fun1(int number) {


        if (number <= 0) return 0;
        else if (number == 1) return 1;
        int i = 2;
        while (i <= number) {


            if (number % i == 0) return number / i;
            else i++;
        }
        return 0;
    }
}












