package coreJava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class MaxFreqSubstring {
 public static void main(String[] args) {
	 String s = "aababcaab";
	 int maxLetters = 2, minSize = 3, maxSize = 4;
	 System.out.print( maxFreq(s,maxLetters,minSize,maxSize));

 }
 public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
     Map<String,Integer> freq = new HashMap<>();
     int n = s.length();
     int maxCount = 0;
     for(int i=0;i<=n-minSize;i++){
         String sub = s.substring(i, i+minSize);
         if(countUniqueLetter(sub) <= maxLetters){
             freq.put(sub,freq.getOrDefault(sub,0)+1);
             maxCount = Math.max(maxCount,freq.get(sub));
         }
     }
     return maxCount;
 }
 private static int countUniqueLetter(String sub){
     Set<Character> set = new HashSet<>();
     for(char c:sub.toCharArray()){
         set.add(c);
     }
     return set.size();
 }

}
