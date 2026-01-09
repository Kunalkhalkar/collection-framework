/*
return the size of linked list
*/
import java.util.*;
public class MyLinkedList2{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		MyLinkedList mll= new MyLinkedList();
		for(int i=0; i<5; i++){
			mll.addLast(sc.nextInt());
		}
		mll.iterate();
	}
}

class MyLinkedList{
	Node head = null; //assigning head to null
	
	class Node{
		private int id;
		private Node next;
		
		//getters and setters
		Node(int id){
			this.id = id;
		}
		
		public void setId(int id){
			this.id = id;
		}
		public void setNext(Node next){
			this.next = next;
		}
		
		public int getId(){
			return id;
		}
		public Node getNext(){
			return next;
		}
	}
	
	void addFirst(int id){
		if(head == null){ // checking if head is null
			head = new Node(id); // if null object is createdd and stored in head
			return;
		}
		 Node temp = new Node(id); // if not null then create temp reference 
		 temp.setNext(head);// store the head to temp's next 
		 head = temp; // assign temp to head
	} 
	private Node traverse(){
			Node temp = head;
		if(head == null){
			System.out.println("list is empty");
		}else{
			while(temp.getNext() != null)// traversing the linked list to find last element
			{
				temp = temp.getNext();
			}
		}return temp; // returning last element
	}
	
	void addLast(int id){
		if(head == null){
			head = new Node(id);
			return;
		}
		Node lNode = traverse();
		lNode.setNext(new Node(id));
	}
	
	void iterate(){
		Node temp = head;
		//printing the elements of linked list
		while(temp != null){
			System.out.print(temp.getId() +"->");
			temp = temp.getNext();
		}
		System.out.println("Null");
	}
	
}