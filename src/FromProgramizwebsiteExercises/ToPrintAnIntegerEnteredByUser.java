package FromProgramizwebsiteExercises;


import java.util.Scanner;

public class ToPrintAnIntergerEnteredByUser {

    public static void main(String[] args) {


        // Create a reader instance which takes
        // Input from standard input - Keyboard
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter a number");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        //Println() prints the following line to the output screen
        System.out.println("You entered :" +number);
    }

}
