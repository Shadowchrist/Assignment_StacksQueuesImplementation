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
}
