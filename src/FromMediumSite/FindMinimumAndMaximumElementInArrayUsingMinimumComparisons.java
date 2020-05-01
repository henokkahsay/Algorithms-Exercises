package FromMediumSite;

public class FindMinimumAndMaximumElementInArrayUsingMinimumComparisons {
        // Naive solution to find minimum and maximum number in an array
        public static void findMinAndMax(int[] A)
        {
            // initialize minimum and maximum element by first element
            int max = A[0];
            int min = A[0];

            // do for each element in the array
            for (int i = 1; i < A.length; i++)
            {
                // if current element is greater than maximum found so far
                if (A[i] > max) {
                    max = A[i];
                }

                // if current element is smaller than minimum found so far
                else if (A[i] < min) {
                    min = A[i];
                }
            }

            System.out.println("The minimum element in the array is " + min);
            System.out.println("The maximum element in the array is " + max);
        }

        public static void main(String[] args)
        {
            int[] A = { 5, 7, 2, 4, 9, 6 };

            // find minimum and maximum element respectively
            findMinAndMax(A);
        }
    }

