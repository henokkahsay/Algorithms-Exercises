package FromYouTube;

public class How_toGetLargest_Subtraction {
    public static void main(String[] args) {
        //Possible Inputs are:
        // {1,2,5,6,4},{12,54,8,3,41},null,{45}
        int[] array = {1,1,1,1,2,1};
        System.out.println(fun6(array));
    }

    public static int fun6(int[] array) {
        if (array == null || array.length <= 1) return -1;
        int sub = 0, retSub = 0;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++) {
                sub = array[i] - array[j];
                if (sub < 0) sub *= -1;
                if (sub > retSub) retSub = sub;
            }
        return retSub;
    }
}
