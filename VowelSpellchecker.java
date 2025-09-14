package coreJava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class VowelSpellchecker {
  public static void main(String[] args) {
	  String[] wordlist = {"KiTe","kite","hare","Hare"};
	  String[] queries = {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
	  System.out.print(spellchecker(wordlist,queries));  
  }
  public static String[] spellchecker(String[] wordlist, String[] queries) {
      Set<String> exactMatch = new HashSet<>();
      Map<String,String> caseInsen = new HashMap<>();
      Map<String,String> vowelInsen = new HashMap<>();
      for(String w:wordlist){
          exactMatch.add(w);
          String lower = w.toLowerCase();
          caseInsen.putIfAbsent(lower,w);
          String devowel = devowel(lower);
          vowelInsen.putIfAbsent(devowel,w);
      }
      String[] res = new String[queries.length];
      for(int i=0;i<queries.length;i++){
          String q = queries[i];
          if(exactMatch.contains(q)){
              res[i] = q;
              continue;
          }
          String lower = q.toLowerCase();
          if(caseInsen.containsKey(lower)){
              res[i] = caseInsen.get(lower);
              continue;
          }
          String devowel = devowel(lower);
          if(vowelInsen.containsKey(devowel)){
              res[i] = vowelInsen.get(devowel);
              continue;
          }
          res[i] = "";
      }
      return res;
  }
  private static String devowel(String word){
      StringBuilder sb = new StringBuilder();
      for(char c:word.toCharArray()){
          if(isVowel(c)) 
            sb.append('*');
          else
            sb.append(c);
      }
      return sb.toString();
  }
  private static boolean isVowel(char c){
      return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
  }
}
