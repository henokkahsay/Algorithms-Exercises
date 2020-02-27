package FromProgramizwebsiteExercises;

public class ToFindAsciiValueOfACharacter {
    public static void main(String[] args) {
        char ch='D';
         int ascii=ch;

        //We can also cast char to int
        int castAscii=(int)ch;
        System.out.println("The ASCII Value Of "+ ch+"is: "+ascii);
        System.out.println("The ASCII Value Of "+ ch+"is: "+castAscii);

    }
}
