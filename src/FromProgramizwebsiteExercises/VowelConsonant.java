package FromProgramizwebsiteExercises;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a Character ");
        char ch = reader.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println(ch + " is vowel");
        } else
            System.out.println(ch + " is consonant");

    }
}
