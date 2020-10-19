package stackandqueue;

public class ImplementStack<K> {
	
	public LinkedList<K> list;
	
	public ImplementStack() {
		this.list =new LinkedList<K>(null,null);
	}

	public void push(MyNode<K> newNode) {
		list.addNode(newNode);	
	}

	public void printStack() {
		list.printLinkedList(list.getHead());		
	}
}
