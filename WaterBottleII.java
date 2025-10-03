package coreJava;
public class WaterBottleII {
	public static void main(String[] args) {
		int numBottles = 13, numExchange = 3;
		System.out.print("max number of Bottles Drunk is: "+maxBottlesDrunk(numBottles, numExchange));
	}
	public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int fullBottles = numBottles;
        int bottlesDrunk = 0;
        while (fullBottles > 0) {
            bottlesDrunk += fullBottles;
            emptyBottles += fullBottles;
            fullBottles = 0;
            while (emptyBottles >= numExchange) {
                emptyBottles -= numExchange;
                fullBottles++;
                numExchange++;
            }
        }

        return bottlesDrunk;
    }
}

