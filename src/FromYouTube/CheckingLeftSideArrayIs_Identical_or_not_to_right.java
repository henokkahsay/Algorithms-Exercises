package FromYouTube;

public class CheckingLeftSideArrayIs_Identical_or_not_to_right {

    public static void main(String[] args) {
        //Possible Inputs are
        //{1,2,3,1,2,3},{1,2,3,4,5,6},{1,2,3,2,3,1},{1,2,3,9,1,2,3},{4,7,8,9,4,9,8),{1}
        int[] array={1,2,3,1,2,3};
        System.out.println(fun2(array));

    }

    public static int fun2(int[] array) {
        if (array == null || array.length == 1) return 0;
        else if (array.length % 2 == 0) {
            for (int i = 0, j = array.length / 2; i < array.length / 2; i++, j++) {
                if (array[i] != array[j]) return 0;

            }
        }
    else {
        int mid=array.length/2;
        for (int i=0, j=mid+1; i<mid; i++,j++){
            if (array[mid] == array[i] || array[mid]==array[j] || array[i]!=array[j]) return 0;

        }
        }
    return 1;
    }

    }



