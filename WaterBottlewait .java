package coreJava;
public class WaterBottle {
	public static void main(String[] args) {
		int numBottles = 9, numExchange = 3;
		System.out.print("maximum number of water bottles drink is: "+numWaterBottles(numBottles, numExchange));
	}
	public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles >= numExchange){
            int carry = numBottles % numExchange;
            int bottles =  numBottles / numExchange;
            numBottles = carry +bottles;
            sum = sum + bottles;
        }
        return sum;
    }
}

