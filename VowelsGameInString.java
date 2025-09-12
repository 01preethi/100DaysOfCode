package coreJava;
public class VowelsGameInString {
   public static void main(String[] args) {
	  String s = "leetcoder";
	  System.out.println(doesAliceWin(s));
   }
   public static boolean doesAliceWin(String s) {
	   for(char c:s.toCharArray()) {
		   if(isVowels(c)) return true;
	   }
	   return false;
   }
   private static boolean isVowels(char c) {
	   return c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'; 
   }
}
