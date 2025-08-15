package coreJava;
public class SuperPow {
	private static final int MOD = 1337;
	public static void main(String[] args) {
		int a = 2;
		int[] b = {4,3,3,8,5,2};
		System.out.print(superPow(a,b));	
	}
    public static int superPow(int a, int[] b) {
        a = a%MOD;
        int result = 1;
        for(int d:b){
            result = powMod(result,10);
            result = (result*powMod(a,d))%MOD;
        }
        return result;
    }
    private static int powMod(int a,int n){
        int res = 1;
        a%=MOD;
        while(n>0){
            if(n%2 == 1) 
              res = (res*a)%MOD;
              a=(a*a)%MOD;
            n/=2;
        }
        return res;
    }

}
