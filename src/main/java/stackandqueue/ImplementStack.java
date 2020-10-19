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
	
	public MyNode<K> peek() {
		return list.getHead();
	}
	
	public void pop() {
		list.deleteFirstElement(list.getHead());
	}

	public boolean isEmpty() {
		if(list.size(list.getHead())==0)
			return true;
		else
			return false;
	}
}
