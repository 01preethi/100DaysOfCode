package coreJava;
import java.util.PriorityQueue;
public class MaximumAvgPassRatio {
 public static void main(String[] args) {
	 int[][] classes = {{1,2},{3,5},{2,2}};
	 int extraStudents = 2;
	 System.out.print(maxAverageRatio(classes,extraStudents));
 }
 public static double maxAverageRatio(int[][] classes, int extraStudents) {
     PriorityQueue<double[]> pq = new PriorityQueue<>(
         (a, b) -> Double.compare(b[0], a[0]));
     for (int[] c : classes) {
         int pass = c[0];
         int total = c[1];
         double gain = ((double)(pass + 1)/(total + 1))-((double)pass/ total);
         pq.offer(new double[] {gain, pass, total});
     }
     for (int i = 0; i < extraStudents; i++) {
         double[] top = pq.poll();
         double gain = top[0];
         int pass = (int) top[1];
         int total = (int) top[2];
         pass++;
         total++;
         gain = ((double) (pass + 1) / (total + 1)) - ((double) pass / total);
         pq.offer(new double[] {gain, pass, total});
     }
     double sumRatio = 0.0;
     while (!pq.isEmpty()) {
         double[] top = pq.poll();
         int pass = (int) top[1];
         int total = (int) top[2];
         sumRatio += (double) pass / total;
     }
     return sumRatio / classes.length;
 }

}
