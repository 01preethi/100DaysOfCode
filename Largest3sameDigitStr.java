package coreJava;
public class Largest3sameDigitStr {
 public static void main(String[] args) {
	 String num = "6777133339";
	 System.out.print(largestGoodInteger(num));
 }
 public static String largestGoodInteger(String num) {
     String maxG = "";
     for(int i=0; i<=num.length()-3; i++){
    	 String sub = num.substring(i, i+3);
    	 if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)) {
    		 if(maxG.isEmpty() || sub.compareTo(maxG)>0) {
    			 maxG = sub;
    		 }
    	 }
     }
     return maxG;
 }
}
