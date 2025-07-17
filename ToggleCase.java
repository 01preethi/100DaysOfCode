package Java;

public class ToggleCase {
	public static void main(String []args) {
		String s = "HEllo worLD";
		System.out.println(toLowerCase(s));
	}
	    public static String toLowerCase(String s) {
	        StringBuilder toggle = new StringBuilder();
	        for(char ch:s.toCharArray()){
	            if(Character.isUpperCase(ch))
	                toggle.append(Character.toLowerCase(ch));
	            else if(Character.isLowerCase(ch))
	                toggle.append(Character.toUpperCase(ch));
	            else
	                toggle.append(ch);
	        }
	        return toggle.toString();
	    }
	
}
