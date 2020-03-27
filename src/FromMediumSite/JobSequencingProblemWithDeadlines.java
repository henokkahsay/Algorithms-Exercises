package FromMediumSite;

import java.util.*;
public class JobSequencingProblemWithDeadlines {
    // data structure to store jobs info. Each job has an identifier,
// a deadline and profit associated with it
  private int taskID, deadline, profit;

        public JobSequencingProblemWithDeadlines(int taskID, int deadline, int profit) {
            this.taskID = taskID;
            this.deadline = deadline;
            this.profit = profit;
        }

        public int getDeadline() {
            return deadline;
        }

        public int getProfit() {
            return profit;
        }

        public int getTaskID() {
            return taskID;
        }
    };

    class Scheduler
    {
        // schedule jobs to maximize profit
        public static int scheduleJobs(List<JobSequencingProblemWithDeadlines> jobs, int T)
        {
            // stores maximum profit that can be earned by scheduling jobs
            int profit = 0;

            // array to store used and unused slots info
            int[] slot = new int[T];
            Arrays.fill(slot, -1);

            // consider each job in decreasing order of their profits
            for (JobSequencingProblemWithDeadlines job: jobs)
            {
                // search for next free slot and map the task to that slot
                for (int j = job.getDeadline() - 1; j >= 0; j--)
                {
                    if (j < T && slot[j] == -1)
                    {
                        slot[j] = job.getTaskID();
                        profit += job.getProfit();
                        break;
                    }
                }
            }

            // print the scheduled jobs
            System.out.println("The Scheduled jobs are - ");
            Arrays.stream(slot)			// Java 8 Streams
                    .filter(val -> val != -1)
                    .forEach(System.out::println);

            // return total profit that can be earned
            return profit;
        }

        public static void main(String[] args)
        {
            // List of given jobs. Each job has an identifier, a deadline and
            // profit associated with it
            List<JobSequencingProblemWithDeadlines> jobs = Arrays.asList(
                    new JobSequencingProblemWithDeadlines(1, 9, 15), new JobSequencingProblemWithDeadlines(2, 2, 2),
                    new JobSequencingProblemWithDeadlines(3, 5, 18), new JobSequencingProblemWithDeadlines(4, 7, 1),
                    new JobSequencingProblemWithDeadlines(5, 4, 25), new JobSequencingProblemWithDeadlines(6, 2, 20),
                    new JobSequencingProblemWithDeadlines(7, 5, 8), new JobSequencingProblemWithDeadlines(8, 7, 10),
                    new JobSequencingProblemWithDeadlines(9, 4, 12), new JobSequencingProblemWithDeadlines(10, 3, 5)
            );

            // stores maximum deadline that can be associated with a job
            final int T = 15;

            // arrange the jobs in decreasing order of their profits
            Collections.sort(jobs, (a, b) -> b.getProfit() - a.getProfit());

            // schedule jobs and calculate maximum profit
            System.out.println("\nTotal Profit is: " + scheduleJobs(jobs, T));
        }

}
