package FromProgramizwebsiteExercises;

public class ToReverseSentenceUsingRecursion {
    public static void main(String[] args) {
        String sentece="Go work";
        String reversed=reverse(sentece);
        System.out.println("The reversed sentence is :" +reversed);

    }
    public static String reverse(String sentence)
    {
        if (sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1))+sentence.charAt(0);
    }
}
