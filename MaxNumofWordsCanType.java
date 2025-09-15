package coreJava;
public class MaxNumofWordsCanType {
	public static void main(String[] args) {
		String text = "hello world";
		String brokenLetters = "ad";
		System.out.print(canBeTypedWords(text, brokenLetters));
	}
	public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(String w:words){
            boolean canType = true;
            for(char c : brokenLetters.toCharArray()){
                if(w.indexOf(c)!= -1){
                    canType = false;
                    break;
                } 
            }
            if(canType) count++;
        }
        return count;
    }
}
