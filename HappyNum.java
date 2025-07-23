package  CoreJava;
import java.util.HashSet;
public class HappyNum {
	public static void main(String [] args) {
		int n = 19;
		System.out.println(isHappy(n));
		
	}
    public  static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            int square =0;
            while(n > 0){
               int digit = n %10;
               square += digit*digit;
               n /=10;
            }
            n = square;
        
        }
        return n == 1;
    }
}


