/*
another linked list code
*/
class MyLinkedList{
	public Node head = null;
	
	class Node{
		private String name;
		private Node next;
		
		public String getName(){
			return name;
		}
		public Node getNext(){
			return next;
		}
		
		public void setName(String data){
			this.name = data;
		}
		public void setNext(Node next){
			this.next = next;
		}
		
		Node(String data){
			this.name = data;
		}
	}
	
	public void addFirst(String name){
		if(head == null){
			head = new Node(name); // creating the node and assigning to head if it is null
			return;
		}
		
		Node temp = new Node(name); //creating a temporary node
		temp.setNext(head); // assigning head to next of the temp 
		head = temp; // storing temp to head	
	}
	
	private Node traverse(){ // need to call when need to add element at last
		Node temp = head;
		if(head == null){
			System.out.println("List is empty");
			//break;
		}
		else{
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
		}
		return temp;
	}
	
	void addLast(String name){
		if(head == null){
			head = new Node(name);
			return;
		}else{
		
		Node lNode = traverse();// called traverse() method to find last node.
		lNode.setNext(new Node(name)); // change null value to new node.
		}
	}
	
	void iterate(){
		if(head == null){
			System.out.println("No element in linked list"); // if there is no node.
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.getName() +" -> ");
			temp = temp.getNext();
		}
		System.out.print("Null");
	}
	
}

public class MyLinkedList1{
	public static void main(String ...x){
		MyLinkedList ml = new MyLinkedList();
		ml.addLast("Kunal");
		ml.addFirst("hi");
		ml.iterate();
	}
}