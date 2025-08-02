package coreJava;
import java.util.*;
public class RearrangingFruits {
	public static long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> count = new HashMap<>();
        TreeSet<Integer> allFruits = new TreeSet<>();
        
        for (int num : basket1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            allFruits.add(num);
        }
        
        for (int num : basket2) {
            count.put(num, count.getOrDefault(num, 0) - 1);
            allFruits.add(num);
        }
        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for (int key : count.keySet()) {
            int val = count.get(key);
            if (val % 2 != 0) return -1;  
            
            int times = Math.abs(val) / 2;
            for (int i = 0; i < times; i++) {
                if (val > 0) left.add(key);    
                else right.add(key);           
            }
        }

        if (left.size() != right.size()) return -1;

        Collections.sort(left);  
        Collections.sort(right, Collections.reverseOrder()); 

        int minFruit = allFruits.first();  
        long cost = 0;
        int n = left.size();
        
        for (int i = 0; i < n; i++) {
            int a = left.get(i);
            int b = right.get(i);
            cost += Math.min(Math.min(a, b), 2 * minFruit);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] basket1 = {4, 2, 2, 1};
        int[] basket2 = {1, 4, 1, 2};
        long result = minCost(basket1, basket2);
        System.out.println("Minimum cost: " + result); 
    }
}
