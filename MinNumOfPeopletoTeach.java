package coreJava;
import java.util.*;
public class MinNumOfPeopletoTeach {
  public static void main(String[] args) {
	  int n = 3;
	  int[][] languages = {{2},{1,3},{1,2},{3}}, friendships = {{1,4},{1,2},{3,4},{2,3}};
	  System.out.println("number of users need to teach: "+minimumTeachings(n,languages,friendships));
 }
  public static int minimumTeachings(int n,int[][] languages,int[][] friendships){
      Set<Integer> Users =new HashSet<>();
      for(int[] frndship:friendships){
          int u = frndship[0]-1;
          int v = frndship[1]-1;
          Set<Integer> ulangs = new HashSet<>();
          for(int lang:languages[u])
              ulangs.add(lang);
          boolean com = false;
          for(int lang:languages[v]){
              if(ulangs.contains(lang)){
                  com = true;
                  break;
              }
          }
          if(!com){
              Users.add(u);
              Users.add(v);
          }
      }
      int[] langCount = new int[n+1]; 
      int maxAlreadyKnown = 0;
      for (int user : Users) {
          for (int lang : languages[user]) {
              langCount[lang]++;
              maxAlreadyKnown = Math.max(maxAlreadyKnown,langCount[lang]);
          }
      }
      return Users.size() - maxAlreadyKnown;
  }
}
