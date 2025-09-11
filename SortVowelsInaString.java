package coreJava;
import java.util.*;
public class SortVowelsInaString {
	public static void main(String[] args) {
		 String s = "lEetcOde";
		 System.out.print(sortVowels(s));
	}
	public static String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        List<Character> vowelsList = new ArrayList<>();
        for(char c:s.toCharArray()) {
        	if(vowels.contains(c)) 
        		vowelsList.add(c);
        }
        Collections.sort(vowelsList);
        StringBuilder res = new StringBuilder();
        int idx = 0;
        for(char c :s.toCharArray()) {
        	if(vowels.contains(c)) 
        	  res.append(vowelsList.get(idx++));
        	else
        	  res.append(c);
        }
        return res.toString();
	}
}
