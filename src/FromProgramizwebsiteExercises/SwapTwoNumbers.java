package FromProgramizwebsiteExercises;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        float first =1.20f, second=2.45f;
        System.out.println("Before Swap");
        System.out.println("First number ="+first);
        System.out.println("Second number ="+ second);


        //Value of first is assigned to temporary
        float temporary =first;

        //value of second is assigned to first
        first=second;

        // value of temporary
        second=temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}


