package FromMediumSite;
import java.util.Arrays;
public class Main {
    // Recursive function to replace each element of the array with product
    // of every other element without using division operator
        public static int findProduct(int[] A, int n, int left, int i)
        {
            // base case: no elements left on right side
            if (i == n) {
                return 1;
            }

            // take back-up of current element
            int curr = A[i];

            // calculate product of the right sub-array
            int right = findProduct(A, n, left * A[i], i + 1);

            // replace current element with product of left and right sub-array
            A[i] = left * right;

            // return product of right sub-array including current element
            return curr * right;
        }

        // main function
        public static void main(String[] args)
        {
            int[] A = { 5, 3, 4, 2, 6, 8 };

            findProduct(A, A.length, 1, 0);

            // print the modified array
            System.out.println(Arrays.toString(A));
        }

}
