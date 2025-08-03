package coreJava;
public class MaxFruitsHarversed {
  public static void main(String[] args) {
	  int[][] fruits = {
	            {2, 8},{6, 3},{8, 6}
	        };
	        int startPos = 5;
	        int k = 4;

	        int result = maxTotalFruits(fruits, startPos, k);
	        System.out.println("Maximum fruits collected: " + result);
  }
  public static int maxTotalFruits(int[][] fruits, int startPos, int k) {
      int max=0,left=0,sum=0;
      for(int right=0; right<fruits.length; right++){
          sum+= fruits[right][1];
          while(left <= right && minSteps(fruits[left][0], fruits[right][0],startPos)>k){
              sum -= fruits[left][1];
              left++;
          }
          max = Math.max(max, sum);
      }
      return max;
  }
  private static int minSteps(int leftpos,int rightpos,int startpos){
      return Math.min(Math.abs(startpos -leftpos)+(rightpos-leftpos),Math.abs(
          startpos -rightpos)+(rightpos-leftpos));
  }

}
