package FromYouTube;

public class Identify_even_AND_odd_number {


    public static void main(String[] args) {

    int[] array={1,6,3,4,5,2};
        //{1,6,3,4,0,2}
        //{1,6,3,4,8,7}
    System.out.println(fun3(array));
    }
    public static int fun3(int[] array) {
        if (array == null || array.length < 4) return 0;
        int evenIndex = array[0], oddIndex = array[1];
        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0 && evenIndex <array[i])
                evenIndex = array[i];
            else if (i % 2 != 0 && oddIndex > array[i])
                oddIndex = array[i];
            else return 0;
        }
        return 1;
    }
}




