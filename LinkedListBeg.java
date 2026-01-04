/*
create a linked list. add element from baginning of head
*/
import java.util.*;
public class LinkedListBeg{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		LinkedList1 ll = new LinkedList1();
		
		System.out.println("Enter element in linked list");
		int data= sc.nextInt();
		ll.insertAtBeg(data);
		data= sc.nextInt();
		ll.insertAtBeg(data);
		data= sc.nextInt();
		ll.insertAtBeg(data);
		data= sc.nextInt();
		ll.insertAtBeg(data);
		ll.iterate();
	}
}

class LinkedList1{
	private Node head = null;
	private class Node{
		private int data;
		private Node next;
		
		Node(int data){
			this.data = data;
		}
	}
		void insertAtBeg(int value){
			if(head == null){
				head = new Node(value);
				head.next = null;
			}
			else{
				Node temp;
				temp = new Node(value);
				temp.next = head;
				head = temp;
			}
		}
		void iterate(){
			if(head == null){
				System.out.println("Linked list is empty");
			}
			else{
				Node temp = head;
				
				while(temp != null){
					System.out.print(temp.data +"\t");
					temp = temp.next;
					
				}
			}
		}
	
}