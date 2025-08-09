package coreJava;
import java.util.HashMap;
import java.util.Map;
public class CountCommonWords {
 public static void main(String[] args) {
	 String[] words1 = {"leetcode","is","amazing","as","is"};
	 String[] words2 = {"amazing","leetcode","is"};
	 System.out.print(countWords(words1, words2));

 }
 public static int countWords(String[] words1, String[] words2) {
     Map<String,Integer> count1 = new HashMap<>();
     Map<String,Integer> count2 = new HashMap<>();
     for(String w:words1){
         count1.put(w,count1.getOrDefault(w,0)+1);
     }
     for(String w:words2){
         count2.put(w,count2.getOrDefault(w,0)+1);
     }
     int res = 0;
     for(String word:count1.keySet()){
         if(count1.get(word)==1 && count2.getOrDefault(word,0)==1){
             res++;
         }
     }
     return res;
 
 }

}
