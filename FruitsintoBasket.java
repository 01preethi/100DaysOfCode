package coreJava;
public class FruitsintoBasket {
 public static void main(String[] args) {
	 int[] fruits = {1,2,1};
	 System.out.print(totalFruit(fruits)) ;
 }
 public static int totalFruit(int[] fruits) {
     int[] count = new int[fruits.length+5];
     int type=0,left=0,len=0;
     int max=0;
     for(int r=0; r<fruits.length; r++){
      count[fruits[r]]++;
      if(count[fruits[r]]==1)
          type++;
      while(type>2){
          count[fruits[left]]--;
          if(count[fruits[left]]==0)
            type--;
          left++;
      }
      len = r-left+1;
      max = max>len?max:len;
     }
     return max;
  }

}
