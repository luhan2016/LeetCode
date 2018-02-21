package Linkedlist;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if(head.next==null)
			return head;
		ListNode tmp = head;
		head.next = reverseList(head.next);
		head = head.next;
		head.next = tmp;
		return head;
	}   
	public static void main(String args[]) {
    	ListNode ld = new ListNode(1);
    	ld.next = new ListNode(2);
    	ld.next.next= new ListNode(3);
    	ld.next.next.next = new ListNode(4);
    	ld.next.next.next.next = new ListNode(5);
    	ld.next.next.next.next.next = new ListNode(6);
    	ReverseList rL = new ReverseList();
    	rL.reverseList(ld);
    	while(ld!=null) {
    		System.out.println(ld.val);
    		ld=ld.next;
    	}
    }
}
