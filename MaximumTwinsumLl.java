package coreJava;
public class MaximumTwinsumLl {
  static class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int val) {
	      this.val = val;
	      this.next = null;
	  }
	}
  public static int pairSum(ListNode head) {
     ListNode slow = head, fast = head;
     while(fast!=null && slow!=null){
         slow = slow.next;
         fast = fast.next.next;
     }
     ListNode prev = null;
     while(slow!=null){
         ListNode NextNode = slow.next;
         slow.next = prev;
         prev = slow;
         slow = NextNode;
     }
     int sum = 0;
     ListNode f = head;
     ListNode s = prev;
     while(s!=null){
         sum = Math.max(sum, f.val + s.val);
         f = f.next;
         s = s.next;
     }
     return sum;
 }
 public static void main(String[] args) {
	 ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(4);
     MaximumTwinsumLl obj = new MaximumTwinsumLl();
     int result = obj.pairSum(head);
     System.out.println("Maximum twin sum: " + result);  // Output: 5 (1+4 or 2+3)
 }

 }