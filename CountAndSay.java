package coreJava;
public class CountAndSay {
	public static void main(String[] args) {
		int n = 4;
		System.out.print(countAndSay(n));
	}
	private static String countndsay(String a){
        String b = "";
        int n = a.length();
        char prev = a.charAt(0);
        int count = 1;
        for(int i=1;i<n;i++){
            if(prev != a.charAt(i)){
                b+= count;
                b+= prev;
                count = 0;
            }
            count++;
            prev = a.charAt(i);
        }
        b+=count;
        b+=prev;
        return b;
    }
    public static String countAndSay(int n) {
        String ans = "1";
        for(int i=2;i<=n;i++)
          ans = countndsay(ans);
        return ans;
    }
}
