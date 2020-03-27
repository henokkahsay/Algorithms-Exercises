package FromMediumSite;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MergingOverLappingIntervals {
        int begin, end;

        MergingOverLappingIntervals(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        public String toString() {
            return "{" + begin + "," + end + "}";
        }
    };


    class MergeIntervals
    {
        // Function to merge overlapping intervals
        public static void mergeIntervals(List<MergingOverLappingIntervals> intervals)
        {
            // sort the intervals in increasing order of their starting time
            Collections.sort(intervals, (a, b) -> a.begin - b.begin);

            // create an empty stack
            Stack<MergingOverLappingIntervals> stack = new Stack();

            // do for each interval
            for (MergingOverLappingIntervals curr: intervals)
            {
                // if stack is empty or top interval in stack do not overlap
                // with current interval, push it to the stack
                if (stack.empty() || curr.begin > stack.peek().end) {
                    stack.push(curr);
                }

                // if top interval of stack overlap with current interval,
                // merge two intervals by updating ending of top interval
                // to ending of current interval
                if (stack.peek().end < curr.end) {
                    stack.peek().end = curr.end;
                }
            }

            // print all non-overlapping intervals
            while (!stack.empty()) {
                System.out.println(stack.pop());
            }
        }

        public static void main(String[] args)
        {
            List<MergingOverLappingIntervals> intervals = Arrays.asList(new MergingOverLappingIntervals(1, 5),
                    new MergingOverLappingIntervals(2, 3), new MergingOverLappingIntervals(4, 6),
                    new MergingOverLappingIntervals(7, 8), new MergingOverLappingIntervals(8, 10),
                    new MergingOverLappingIntervals(12, 15)
            );

            mergeIntervals(intervals);
        }
}
