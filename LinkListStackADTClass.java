package SS;

public class LinkListStackADTClass<E> {
	private Node<E> top;
	private int size;
	
	//creating a private inner class to protect the data
	private class Node<E>{
		private E data;
		private Node<E> next;
		
		public Node(E data){
			this.data = data;
			this.next = null;
		}
	}
	
	//constructor
	public LinkListStackADTClass() {
		top = null;
		size = 0;
	}
	
	//push method
	public void push(E data) {		
		Node<E> newNode = new Node<E>(data); 
		newNode.next = top;
		top = newNode;
		size++;
			
		}
	
	//pop method
	public E pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		
		E data = top.data;
		top = top.next;
		size--;
		return data;
	}
	
	//peek method
	public E peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return top.data;		
	}
	
	//I included the isEmpty method for the pop and peek classes to check if the stack is empty before either removing an element or peeking at one
	public boolean isEmpty() {
		return size == 0;
	}
	
	
}
	
	

