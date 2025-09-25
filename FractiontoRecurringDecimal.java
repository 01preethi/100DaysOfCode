package coreJava;
import java.util.HashMap;
import java.util.Map;
public class FractiontoRecurringDecimal {
	public static void main(String[] args) {
		int numerator = 1, denominator = 2;
		System.out.println(fractionToDecimal(numerator,denominator));
	}
	public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        StringBuilder res = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0))
            res.append("-");
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        res.append(num / denom);
        long remain = num % denom;
        if (remain == 0)
            return res.toString();
        res.append(".");
        Map<Long, Integer> remainMap = new HashMap<>();
        while (remain != 0) {
            if (remainMap.containsKey(remain)) {
                int pos = remainMap.get(remain);
                res.insert(pos, "(");
                res.append(")");
                break;
            }
            remainMap.put(remain, res.length());
            remain *= 10;
            res.append(remain / denom);
            remain %= denom;
        }
        return res.toString();
    }
}
