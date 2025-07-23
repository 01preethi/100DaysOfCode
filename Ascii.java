package CoreJava;
public class Ascii  {
    public static void main(String[] args) {
        String str = "pre_A&ethi_456";
        for(char ch:str.toCharArray()){
            System.out.println("ascii values for"+ " " + ch +" "+ (int)ch);
        }
    }
}
