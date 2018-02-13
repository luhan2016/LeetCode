package Linkedlist;

public class RemoveElements {
	public ListNode removeElements(ListNode head, int val) {
        if (head == null) 
        	return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
    public static void main(String args[]) {
    	ListNode ld = new ListNode(1);
    	ld.next = new ListNode(2);
    	ld.next.next = new ListNode(6);
    	ld.next.next.next= new ListNode(3);
    	ld.next.next.next.next = new ListNode(4);
    	ld.next.next.next.next.next = new ListNode(5);
    	ld.next.next.next.next.next.next = new ListNode(6);
    	RemoveElements rE = new RemoveElements();
    	rE.removeElements(ld, 6);
    	while(ld!=null) {
    		System.out.println(ld.val);
    		ld=ld.next;
    	}
    }
}
