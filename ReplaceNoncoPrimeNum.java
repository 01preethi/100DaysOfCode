package coreJava;
import java.util.*;
public class ReplaceNoncoPrimeNum {
  public static void main(String[] args) {
		int[] nums = {6,4,3,2,7,5,6,2};
		List<Integer> res = replaceNonCoprimes(nums);
		System.out.print(res);
  }
  public static List<Integer> replaceNonCoprimes(int[] nums) {
      Stack<Long> stack = new Stack<>();
      for(int num:nums){
       long cur = num;
       while(!stack.isEmpty()){
           long top = stack.peek();
           int g = gcd((int) top,(int)cur);
           if(g==1) break;
           stack.pop();
           cur = lcm((int)top,(int) cur);
       }
       stack.push(cur);
      }
      List<Integer> res = new ArrayList<>();
      for(long val : stack){
       res.add((int)val);
      }
      return res;
   }
   private static int gcd(int a,int b){
       while(b!=0){
           int temp = b;
           b = a%b;
           a = temp;
       }
       return a;
   }
   private static long lcm(int a,int b){
       return (long)a*b/gcd(a,b);
   } 

}
