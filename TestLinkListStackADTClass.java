package SS;

public class TestLinkListStackADTClass{
	public static void main(String[] args) {
	
	//creating 2 separate stacks with different data types
	LinkListStackADTClass<Integer> intStack = new LinkListStackADTClass<Integer>();
	LinkListStackADTClass<String> stringStack = new LinkListStackADTClass<String>();
	
	System.out.println("The Integer stack. ");
	//pushing numbers onto the Integer stack
	intStack.push(30);
	intStack.push(1000);
	intStack.push(70);
	intStack.push(6);
	intStack.push(45);
	
	//popping off some numbers from the Integer stack
	System.out.println("Popped: " + intStack.pop());
	
	//Peeking at the top element of the Integer stack
	System.out.println("Peek: " + intStack.peek());
	
	System.out.println("Popped: " + intStack.pop());
	System.out.println("Popped: " + intStack.pop());
	
	//Peeking at the top element of the Integer stack
	System.out.println("Peek: " + intStack.peek());
	
	System.out.println();
	System.out.println("The String stack. ");
	
	//pushing elements to the String stack
	stringStack.push("Mia");
	stringStack.push("Kayla");
	stringStack.push("Aria");
	stringStack.push("Wendy");
	stringStack.push("Heidi");
	
	//popping off elements from the String stack
	System.out.println("Popped: " + stringStack.pop());
	System.out.println("Popped: " + stringStack.pop());
	
	//peeking at the top element of the String stack
	System.out.println("Peek: " + stringStack.peek());
		
	
	}
	
}
