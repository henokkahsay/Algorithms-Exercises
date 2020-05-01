package FromMediumSite;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CustomSortArrayBasedOnAnotherArray {


        public static void customSort(int[] first, int[] second)
        {
            // map to store frequency of each element of first array
            Map<Integer, Integer> freq = new TreeMap<>();

            // freq frequency of each element of first array and
            // store it in a map.
            for (int i: first) {
                freq.putIfAbsent(i, 0);
                freq.put(i, freq.get(i) + 1);
            }

            // Note that once we have the frequencies of all elements of
            // first array, we can overwrite elements of first array

            int index = 0;

            // do for every element of second array
            for (int i: second)
            {
                // If current element is present in the map, print it n times
                // where n is the frequency of that element in first array
                int n = freq.getOrDefault(i, 0);
                while (n-- > 0) {
                    first[index++] = i;
                }

                // erase the element from map
                freq.remove(i);
            }

            // Now we are only left with elements that are only present
            // in the first array but not present in the second array
            // We need to sort the remaining elements present in the map
            // Since we use a TreeMap, keys are already sorted

            for (Map.Entry<Integer,Integer> entry: freq.entrySet()) {
                int count = entry.getValue();
                while (count-- > 0) {
                    first[index++] = entry.getKey();
                }
            }
        }

        public static void main(String[] args)
        {
            int[] first = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4 };
            int[] second = { 3, 5, 7, 2 };

            customSort(first, second);

            System.out.println("After sorting the array is : " + Arrays.toString(first));
        }
}
