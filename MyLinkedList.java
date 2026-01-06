/*
add Linked List and create methods to insert at beginning and last
*/
import java.util.*;
public class MyLinkedList{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in linked list");
		LL l = new LL();
		l.addFirst("hello");
		l.addLast("Kunal");
		l.addFirst("hi,");
		l.addLast("KK");
		l.addLast("KK");
		l.addFirst("kk");
		l.iterate();
		l.deleteLast();
		System.out.println();	
		l.iterate();
		
		
	}
}

class LL{
	Node head = null;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	void addFirst(String data){
		if(head == null){
			head = new Node(data);
			head.next = null;
		}
		else{
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
		
	}
	
	void addLast(String data){
		if(head == null){
			head = new Node(data);
		}
		else{
			Node lNode = traverse();
			lNode.next = new Node(data);
		}
	}
	
	private Node traverse(){
		if(head == null){
			System.out.println("Linked list is empty");
		}
		else{
			Node temp = head;
			
			while(temp.next != null){
				temp = temp.next;
			}
			return temp;
		}
		return head;		
	}
	
	private Node secondNode(){
		if(head == null){
			System.out.println("Linked list is empty");
		}
		else{
			Node temp = head;
			Node secondNode= null;
			while(temp.next != null){
				secondNode = temp;
				temp = temp.next;
				
			}
			return secondNode;
		}
		return head;
	}
	void iterate(){
		if(head == null){
			System.out.println("Linked list is empty");
			
		}
		else{
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.print("null");
	}
	}
	
	void deleteLast(){
		if(head == null){
			System.out.println("Linked list is empty");
			return;
		}
		
		Node secLastNode = secondNode();
		secLastNode.next = null;
	}
}
