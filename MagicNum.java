package CoreJava;

public class MagicNum {

    public static void main(String[] args) {
        int num = 19;
        if(isMagic(num)){
            System.out.println(num+"is a magic number");
        }
        else{
            System.out.println(num+"is not a magic number");
        }

    }
    public static boolean isMagic(int n){
        while(n>9){
            n = SumOfDigits(n);
        }
        return n == 1;
    }

    public static int SumOfDigits(int numbers){
        int sum = 0;
        while(numbers>=0){
             sum = sum + numbers%10;
             numbers/=10;
        }
        return sum;
    }
}