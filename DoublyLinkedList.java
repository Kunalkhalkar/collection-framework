/*
try to devlop the double ended linked list
*/
import java.util.*;
public class DoublyLinkedList{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in doubly linked list");
		MyDoublyLinkedList mdl= new MyDoublyLinkedList();
		mdl.addFirst(10);
		mdl.addFirst(20);
		mdl.addFirst(30);
		mdl.addFirst(40);
		mdl.iterate();
	}
}
class MyDoublyLinkedList{
	Node head = null;
	class Node{
		private Node next;
		private Node prev;
		private int data;
		
		Node(int data){
			this.data = data;
		}
		public void setNext(Node next){
			this.next = next;
		}
		
		public void setPrev(Node prev){
			this.prev = prev;
		}
		
		public void setData(int data){
			this.data = data;
		}
		
		public Node getPrev(){
			return prev;
		}
		
		public Node getNext(){
			return next;
		}
		
		public int getData(){
			return data;
		}
		
	}
	// this function id used to insert Node in doubly linked list but from the first node
	void addFirst(int data){
		if(head == null){
			head = new Node(data);
			return;
		}
		Node temp = new Node(data);
		head.setPrev(temp);
		temp.setNext(head);
		head = temp;
	}
	// used to iterate linked list
	void iterate(){
		Node temp = head;
		Node tempR = null;
		while(temp != null){
			System.out.print(temp.getData()+ " -> ");
			tempR = temp;
			temp = temp.getNext();
		}
		System.out.print("Null");
		System.out.println();

		 while(tempR != null){
			 System.out.print(tempR.getData()+ " -> ");
			 tempR = tempR.getPrev();
		 }
		System.out.print("Null(head)");
	}
	

}