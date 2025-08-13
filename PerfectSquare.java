package coreJava;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class PerfectSquare {
 public static void main(String[] args) {
	int n = 12;
	System.out.print(numSquares(n));
 }
 public static int numSquares(int n) {
     List<Integer> squares = new ArrayList<>();
     for (int i = 1; i * i <= n; i++) {
         squares.add(i * i);
     }
     Queue<Integer> queue = new LinkedList<>();
     queue.offer(n);       
     boolean[] visited = new boolean[n + 1];
     visited[n] = true;
     int level = 0; 
     while (!queue.isEmpty()) {
         int size = queue.size();
         level++;           
         for (int i = 0; i < size; i++) {
             int current = queue.poll();
             for (int square : squares) {
                 int next = current - square;
                 if (next == 0) 
                     return level;
                 if (next > 0 && !visited[next]) {
                     visited[next] = true;
                     queue.offer(next);
                 }
             }
         }
     }
     return level;
 }

}
