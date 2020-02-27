package FromYouTube;

public class DifferenceOfOddAndEvenSum {
//Examples
//{1},{1,2},{1,2,3},{1,2,3,4},{3,2,3,4},{4,1,2,3},{1,1},{}
    public static void main(String[] args) {
        int[] sampleData ={3,2,3,4};

        int result = Calculate(sampleData);
        System.out.println(String.valueOf(result));

    }

   static int Calculate(int[] givenArray){
        int sumOfOddNumbers=0;//x
        int sumOfEvenNumbers=0;// Y
        for (int i=0; i< givenArray.length;i++){
            if ((givenArray[i]%2)==0) {// The current value of Even
                sumOfEvenNumbers = sumOfEvenNumbers + givenArray[i];
            }
            else {
                sumOfOddNumbers=sumOfOddNumbers + givenArray[i];
            }
        }
        return (sumOfOddNumbers - sumOfEvenNumbers);
    }
}
