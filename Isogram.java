package Java;

//public class Isogram {
//	public static void main(String [] args) {
//	String input = "preethi";
//	String str = input.toLowerCase();
//	boolean isogram = true ;
//	for(int i = 0;i<=str.length();i++) {
//		for(int j = i+1; j<str.length();j++) {
//			if(str.charAt(i) == str.charAt(j)) {
//				isogram = false;
//				break;
//			}
//		}
//		if(!isogram)
//			break;
//	}
//	if(isogram)
//		System.out.println(input +"is a isogram");
//	else
//		System.out.println(input +" is not a isogram");
// }
//	
//}


import java.util.HashSet;
public class Isogram{
	public static void main(String [] args) {
		String input = "preethi";
		String str = input.toLowerCase();
		HashSet<Character> set = new HashSet<>();
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(set.contains(ch)) {
				System.out.println("Not an Isogram");
				return;
			}
			set.add(ch);

		}
		System.out.println("It is an Isogram");
	}
	
}