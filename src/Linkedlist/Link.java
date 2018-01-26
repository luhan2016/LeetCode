package Linkedlist;

import java.util.LinkedList;

public class Link {
	public String bookName;
	public int millionsSold;
	public Link next;
	
	public Link(String bookName, int millionsSold) {
		this.bookName = bookName;
		this.millionsSold = millionsSold;	
	}
	
	public void display() {
		System.out.println(bookName + ":" + millionsSold + ",000,000");	
	}
	
	public String toString() {
		return bookName;
	}
	
	public static void main(String[] args) {	
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("firstbook", 100);
		theLinkedList.insertFirstLink("secondbook", 200);
		theLinkedList.insertFirstLink("thirdbook", 300);
		theLinkedList.display();
		
		theLinkedList.removeLink("thirdbook");
		theLinkedList.display();
		
		System.out.println(theLinkedList.find("firstbook").bookName + "was found");
	}
}
