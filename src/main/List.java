package main;
/**
 * Definition for singly-linked list.*/
 
public class List {
	
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    	ListNode result = null;
    	ListNode tmp = null;
    	if(l1 != null || l2!= null) {
    		tmp = new ListNode(l1.val+l2.val);
    		result = tmp;
    	}
        while (l1.next != null || l2.next != null) {
        	
        	l1=l1.next;
        	l2=l2.next;
        	tmp.next = new ListNode(l1.val+l2.val);
        	result = tmp;
        	tmp = tmp.next;
        }
        
        return result;
    }
    
   public static void main(String[] args) {
	   ListNode l1 = new ListNode(3);
	   l1.next = new ListNode(4);
	   l1.next.next = new ListNode(5);
	   
	   ListNode l2 = new ListNode(0);
	   l2.next = new ListNode(1);
	   l2.next.next = new ListNode(2);
	   
	   ListNode res = addTwoNumbers(l1, l2);
	   
	   while(res != null) {
		   System.out.println(res.val);
		   res = res.next;
	   }
	   
   }
    
    
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
   
}