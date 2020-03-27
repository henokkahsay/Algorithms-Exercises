package FromMediumSite;
import java.util.*;
public class ActivitySelectionProblem {
    private int start, finish;

        public ActivitySelectionProblem(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
        public int getFinish() {
            return finish;
        }
        public int getStart() {
            return start;
        }
        public String toString() {
            return "{" + getStart() + ", " + getFinish() + "}";
        }
    };

    class ActivitySelection
    {
        // Activity-Selection problem
        public static Set<Integer> selectActivity(List<ActivitySelectionProblem> activities)
        {
            // k keeps track of the index of the last selected activity
            int k = 0;

            // set to store the selected activities index
            Set<Integer> out = new HashSet<>();

            // select 0 as first activity
            out.add(0);

            // start iterating from the second element of
            // vector up to its last element
            for (int i = 1; i < activities.size(); i++)
            {
                // if start time of i'th activity is is greater or equal
                // to the finish time of the last selected activity, it
                // can be included in activities list
                if (activities.get(i).getStart() >= activities.get(k).getFinish())
                {
                    out.add(i);
                    k = i;	// update i as last selected activity
                }
            }

            return out;
        }

        public static void main(String[] args)
        {
            // list of given jobs. Each job has an identifier, a deadline and
            // profit associated with it
            List<ActivitySelectionProblem> activities = Arrays.asList(new ActivitySelectionProblem(1, 4), new ActivitySelectionProblem(3, 5),
                    new ActivitySelectionProblem(0, 6), new ActivitySelectionProblem(5, 7), new ActivitySelectionProblem(3, 8),
                    new ActivitySelectionProblem(5, 9), new ActivitySelectionProblem(6, 10), new ActivitySelectionProblem(8, 11),
                    new ActivitySelectionProblem(8, 12), new ActivitySelectionProblem(2, 13), new ActivitySelectionProblem(12, 14));

            // Sort the activities according to their finishing time
            Collections.sort(activities, (a, b) -> a.getFinish() - b.getFinish());

            Set<Integer> res = selectActivity(activities);

            for (Integer i: res) {
                System.out.println(activities.get(i));
            }
        }

}
