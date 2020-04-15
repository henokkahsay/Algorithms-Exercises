package FromMediumSite;
import java.util.ArrayList;
import java.util.List;

public class ToFindAllDistinctCombinationsGivenLength {
        // Function to print all distinct combinations of length k where
        // repetition of elements is allowed
        public static void recur(int[] A, List<Integer> out,
                                 int k, int i, int n)
        {
            // base case: if combination size is k, print it
            if (out.size() == k)
            {
                System.out.println(out);
                return;
            }
            // start from previous element in the current combination
            // till last element
            for (int j = i; j < n; j++)
            {
                // add current element A[j] to the solution and recur with
                // same index j (as repeated elements are allowed in combinations)
                out.add(A[j]);
                recur(A, out, k, j, n);

                // backtrack - remove current element from solution
                out.remove(out.size() - 1);
            }
        }

        // main function
        public static void main(String[] args)
        {
            int[] A = { 1, 2, 1 };
            int k = 2;

            List<Integer> out = new ArrayList<>();
            recur(A, out, k, 0, A.length);
        }
    }

