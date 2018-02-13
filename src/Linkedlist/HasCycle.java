package Linkedlist;

public class HasCycle {
	public boolean hasCycle(ListNode head){
	    if(head==null)
	    	return false;
	    if(head.next==null)
	    	return false;
	    while(head.val!=Integer.MAX_VALUE){
	      head.val=Integer.MAX_VALUE;
	      if(head.next!=null)
	        head = head.next;
	      else
	        return false;
	    }
	    return true;
	}
}
