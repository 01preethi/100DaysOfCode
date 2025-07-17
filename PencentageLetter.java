//leetcode : 2278
//percentage of letter in string
package Java;

public class PencentageLetter {
	public static void main(String [] args) {
		String str = "foobar";
		char c = 'o';
		System.out.println("percentage of characters in s that equal the letter 'o' is: "+percentageLetter(str, c));
		
	}
	
    public static int percentageLetter(String s, char letter) {
	    int count = 0;
	    for(char ch : s.toCharArray()){
            if(ch == letter)
            	count++;
	        }
	    return count *100 /s.length();
    }
}


