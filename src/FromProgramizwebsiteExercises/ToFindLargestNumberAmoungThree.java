package FromProgramizwebsiteExercises;

import java.util.Scanner;

public class ToFindLargestNumberAmoungThree {
    public static void main(String[] args) {
        double n1=-4.5,n2=3.9,n3=2.5;

        if (n1>=n2 && n1>=n3)
            System.out.println(n1 + "Is The Largest Number");
            else if (n2>=n1&&n2>=n3)
                System.out.println(n2 + "Is the Largest Number");
            else
                System.out.println(n3 + "Is The Largest Number");
    }

}
