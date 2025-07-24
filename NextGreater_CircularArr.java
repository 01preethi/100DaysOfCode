/*Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation:
The next greater element for 1 is 3.
The next greater element for 3 is 4.
The next greater element for 2 is 4.
The next greater element for 4 does not exist, so return -1.*/

package coreJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreater_CircularArr {

	public static void main(String[] args) {
		int arr[] = {1, 3, 2, 4};
		System.out.println(nextLargerElement(arr));
	}
	
	public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(result, -1);
        for(int i=2*n-1; i>=0; i--){
            int index = i%n;
            
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[index]){
                stack.pop();
            }
            if(i<n){
            result[index] = stack.isEmpty() ? -1 :arr[stack.peek()];
            }
            stack.push(index);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int val:result){
            list.add(val);
        }
        return list;
        
        
    }

}
