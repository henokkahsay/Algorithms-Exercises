package FromMediumSite;

public class MaxSubsequence {
        // Function to calculate maximum sum in the given array
        // with no adjacent elements considered
        // i --> index of current element
        // prev --> index of previous element included in sum
        public static int maxSumSubseq(int[] arr, int i, int n, int prev)
        {
            // base case: all elements are processed
            if (i == n) {
                return 0;
            }

            // recur by excluding current element
            int excl = maxSumSubseq(arr, i + 1, n, prev);

            int incl = 0;

            // include current element only if it is not adjacent
            // to previous element considered
            if (prev + 1 != i) {
                incl = maxSumSubseq(arr, i + 1, n, i) + arr[i];
            }

            // return maximum sum we get by including or excluding
            // current item
            return Integer.max(incl, excl);
        }

        // main function
        public static void main(String[] args)
        {
            int[] A = { 1, 2, 9, 4, 5, 0, 4, 11, 6 };
            System.out.print("Maximum sum is "
                    + maxSumSubseq(A, 0, A.length, Integer.MIN_VALUE));
        }
}
