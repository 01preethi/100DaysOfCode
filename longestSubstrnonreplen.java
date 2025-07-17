package Java;
import java.util.HashSet;
public class longestSubstrnonreplen {
	public static void main(String [] args) {
		String s = "abcabcbb";
		int output = lengthOfLongestSubstring(s);
		System.out.println("length of non repeating char:"+output);
	}
	public static int lengthOfLongestSubstring(String s) {
	     int left =0, right = 0, maxlen =0;
	     HashSet<Character> seen = new HashSet<>();
         while(right < s.length()){
            char c = s.charAt(right);
            if(!seen.contains(c)){
            	seen.add(c);
	            maxlen = Math.max(maxlen,right-left+1);
	            right++;
	        }
	        else{
	            seen.remove(s.charAt(left));
	            left++;
	        }
	     }
	     return maxlen;
  }


}
