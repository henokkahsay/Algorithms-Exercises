package FromYouTube;

public class Return_An_ArrayElementsUsingParameters {
    public static void main(String[] args) {
        //Possible inputs are:
        // {1,2,5,9,16,17,3} 4 3, {1,2,5,10,16,17,3} 5   2, null,....
        int [] array={1,2,5,10,16,17,3};
        int [] returnArray = fun5(array, 5,2);
if (returnArray==null) System.out.println("The return value is null");
    else {
        for (int i=0; i<returnArray.length;i++){
            System.out.print(returnArray[i] + "  ");
        }
    }

    }
    public  static int[] fun5(int[] array,int lengthArray,int k) {

        if (array == null || lengthArray > array.length || k >= array.length
                || k < 0 || lengthArray < 1 || k >= lengthArray) return null;
        int [] retArray = new int[lengthArray];
        for (int i=0 ,j =0; i <lengthArray;i++){
            retArray[i] =array[j];
            j++;
            if (j >= k) j =0;

    }
return retArray;
    }


}
