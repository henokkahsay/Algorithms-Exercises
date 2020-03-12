package FromProgramizwebsiteExercises;

public class AddTwoComplexNumbersByPassingClassToFunction {
double real;
double imag;
public AddTwoComplexNumbersByPassingClassToFunction(double real, double imag){
    this.real=real;
    this.imag=imag;

}

    public static void main(String[] args) {
    AddTwoComplexNumbersByPassingClassToFunction n1=new AddTwoComplexNumbersByPassingClassToFunction(2.3,4.5),
            n2=new AddTwoComplexNumbersByPassingClassToFunction(34,5.0),
            temp;
        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }
    public static AddTwoComplexNumbersByPassingClassToFunction add(AddTwoComplexNumbersByPassingClassToFunction n1,AddTwoComplexNumbersByPassingClassToFunction n2){
    AddTwoComplexNumbersByPassingClassToFunction temp=new AddTwoComplexNumbersByPassingClassToFunction(0.0,0.0);
        temp.real=n1.real +n2.real;
        temp.imag =n1.imag+n2.imag;
        return (temp);
    }
}


