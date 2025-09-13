package coreJava;
import java.util.HashMap;
import java.util.Map;
public class MostFreqVowelsandConsonant {
  public static void main(String[] args) {
	  String s = "successes";
	  System.out.print("Return the sum of the two frequencies: "+maxFreqSum(s));
  }
  public static int maxFreqSum(String s) {
      String vowels = "aeiou";
      Map<Character,Integer> vowelsFreq = new HashMap<>();
      Map<Character,Integer> consonantFreq = new HashMap<>();
      for(char c:s.toCharArray()){
          if(vowels.indexOf(c)!= -1)
              vowelsFreq.put(c,vowelsFreq.getOrDefault(c,0)+1);
          else
              consonantFreq.put(c,consonantFreq.getOrDefault(c,0)+1);
      }
      int res = 0;
      int maxVowel = 0;
      for(int freq:vowelsFreq.values())
          maxVowel = Math.max(maxVowel,freq);
      int maxConso = 0;
      for(int freq:consonantFreq.values())
          maxConso = Math.max(maxConso,freq);
      return res = maxVowel+maxConso;
  }
}
