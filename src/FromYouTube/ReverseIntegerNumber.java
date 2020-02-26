package FromYouTube;

public class ReverseIntegerNumber {
//Examples
//12005
// 1
//1000
// 0
// -12345
    public static void main(String[] args) {
        int sampleData=100000 ;

        int result=reverseGivenInteger(sampleData);

        System.out.println(String.valueOf(result));
    }
    static  int reverseGivenInteger(int givenInteger){
        int sign =1;
        if (givenInteger == 0){
            return 0;
        }
        if (givenInteger <0){
            sign =-1;
            givenInteger =(-1)* givenInteger;//change given negative number to positive

        }
        int output =0;
        while (givenInteger != 0){
            output=(output * 10)+ (givenInteger%10);
            givenInteger=givenInteger / 10;
        }
        return sign* output;// change proper sign to the out put and return result
    }
}
