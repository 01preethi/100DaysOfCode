package coreJava;

public class BitwiseANDcount {

	public static void main(String[] args) {
		int[] candidates = {16,17,71,62,12,24,14};
		System.out.println(largestCombination(candidates));

	}
	public static int largestCombination(int[] candidates) {
        int max = 0;
        for(int i=0;i<25;i++){
            int count = 0;
            for(int n : candidates){
                count+= (n>>i)&1;
            }
            max = Math.max(max,count);
        }
        return max;
    }

}
