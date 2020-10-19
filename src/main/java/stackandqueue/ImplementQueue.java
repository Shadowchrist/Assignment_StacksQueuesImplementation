package stackandqueue;

public class ImplementQueue<K> {
	
	public LinkedList<K> list;

	public ImplementQueue() {
		this.list = new LinkedList<K>(null,null);
	}

	public void enqueue(MyNode<K> newNode) {
		list.appendNode(newNode);
	}

	public void printQueue() {
		list.printLinkedList(list.getHead());
	}
	
	public MyNode<K> top() {
		return list.getHead();
	}

	public void dequeue() {
		list.deleteFirstElement(list.getHead());
	}
	
	public boolean isEmpty() {
		if(list.size(list.getHead())==0)
			return true;
		else
			return false;
	}
}
