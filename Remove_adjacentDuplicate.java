package coreJava;

import java.util.Stack;

public class Remove_adjacentDuplicate {

	public static void main(String[] args) {
		String s = "deeedbbcccbdaa";
		int k = 3;
		System.out.println("unique string id: "+removeDuplicates(s,k));
		

	}
	public static String removeDuplicates(String s, int k) {
        Stack<Character> charStk = new Stack<>();
        Stack<Integer> countStk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!charStk.isEmpty() && charStk.peek() == c){
                int count = countStk.pop()+1;
                if(count == k)
                    charStk.pop();
                else
                    countStk.push(count);
            }
            else{
                charStk.push(c);
                countStk.push(1);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!charStk.isEmpty()){
            char ch = charStk.pop();
            int count = countStk.pop();
            for(int i =0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}


