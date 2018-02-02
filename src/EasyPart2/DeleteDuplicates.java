package EasyPart2;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode current = head;
    	while(current.next !=null){
    		if(current.val == current.next.val)
    			current.next = current.next.next;
    		else
    			current = current.next;
    	}
		return head;
    }
    
    public void append(ListNode l, int data) {
    	while(l.next != null) {
    		l = l.next;
    	}
    	l.next = new ListNode(data);
    }
    
    public void printNode(ListNode l) {
    	System.out.print("List is:");
    	while(l != null) {
    		System.out.print(l.val);
    		l = l.next;
    	}
    	System.out.println();
    }
    
    public static void main(String[] args) {
    	ListNode l = new ListNode(1);
    	DeleteDuplicates d = new DeleteDuplicates();
    	d.append(l, 1);
    	d.printNode(l);
    	
    	d.append(l, 2);
    	d.printNode(l);
    	
    	d.append(l, 2);
    	d.printNode(l);
    	
    	d.append(l, 3);
    	d.printNode(l);
    	
    	d.deleteDuplicates(l);
    	d.printNode(l);
    }
}