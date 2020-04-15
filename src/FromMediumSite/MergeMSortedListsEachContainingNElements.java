package FromMediumSite;
import java.util.PriorityQueue;
public class MergeMSortedListsEachContainingNElements implements Comparable{
    // A class for heap node
        // value stores the element
        private int value;

        // listNum stores list number of the element
        private int listNum;

        // index stores column number of the list from which element was taken
        private int index;

        MergeMSortedListsEachContainingNElements(int value, int listNum, int index) {
            this.value = value;
            this.listNum = listNum;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getListNum() {
            return listNum;
        }
        public int compareTo(Object o) {
            MergeMSortedListsEachContainingNElements node = (MergeMSortedListsEachContainingNElements)o;
            return value - node.value;
        }
    };

    class MergeLists
    {
        // Function to merge M sorted lists each of size N and
        // print them in ascending order
        public static void printSorted(int[][] list)
        {
            // create an empty min-heap
            PriorityQueue<MergeMSortedListsEachContainingNElements> pq = new PriorityQueue();

            // push first element of each list into the min-heap
            // along with list number and their index in the list
            for (int i = 0; i < list.length; i++) {
                pq.add(new MergeMSortedListsEachContainingNElements(list[i][0], i, 0));
            }

            // run till min-heap is not empty
            while (!pq.isEmpty())
            {
                // extract minimum node from the min-heap
                MergeMSortedListsEachContainingNElements min = pq.poll();

                // print the minimum element
                System.out.print(min.getValue() + " ");

                // take next element from "same" list and
                // insert it into the min-heap
                if (min.getIndex() + 1 < list[0].length)
                {
                    min.setIndex(min.getIndex() + 1);
                    min.setValue(list[min.getListNum()][min.getIndex()]);
                    pq.add(min);
                }
            }
        }

        public static void main(String[] args)
        {
            int[][] list =
                    {
                            { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 },
                            { 16, 18, 22, 28 }
                    };

            printSorted(list);
        }
}
