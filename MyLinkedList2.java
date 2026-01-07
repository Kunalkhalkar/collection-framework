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
	Node head = null;
	
	class Node{
		private int id;
		private Node next;
		
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
		if(head == null){
			head = new Node(id);
			return;
		}
		 Node temp = new Node(id);
		 temp.setNext(head);
		 head = temp;
	} 
	private Node traverse(){
			Node temp = head;
		if(head == null){
			System.out.println("list id empty");
		}
		else{
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
		}
			return temp;
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
		while(temp != null){
			System.out.print(temp.getId() +"->");
			temp = temp.getNext();
		}
		System.out.println("Null");
	}
	
}