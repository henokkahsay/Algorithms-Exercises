package FromMediumSite;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class FindLargestNumberPossibleFromGivenNumber {
        public static void main(String[] args)
        {
            List<String> numbers = Arrays.asList("10", "68", "97", "9", "21", "12");

            // sort using a custom function object
            Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

            // print the sorted sequence
            numbers.stream().forEach(System.out::print);
        }
    }
