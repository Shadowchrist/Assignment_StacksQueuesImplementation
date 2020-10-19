package stackandqueue;

public class LinkedList<K> {
	
	public MyNode<K> head;
	public MyNode<K> tail;
	
	public LinkedList(MyNode<K> head, MyNode<K> tail)
	{
		this.head=head;
		this.tail=tail;
	}
	
	public MyNode<K> getHead() {
		return head;
	}

	public void setHead(MyNode<K> head) {
		this.head = head;
	}

	public MyNode<K> getTail() {
		return tail;
	}

	public void setTail(MyNode<K> tail) {
		this.tail = tail;
		tail.setNext(null);
	}
	
	public void addNode(MyNode<K> newNode) {
		if (tail == null)
			setTail(newNode);
		if (head == null)
			setHead(newNode);
		else {
			MyNode<K> tempNode = this.head;
			setHead(newNode);
			newNode.setNext(tempNode);
		}
	}
	
	public void appendNode(MyNode<K> newNode) {
		if (head == null)
			setHead(newNode);
		if (tail == null)
			setTail(newNode);		
		else {
			this.tail.setNext(newNode);
			setTail(newNode);			
		}
	}
	
	public void insertNode(MyNode<K> targetNode, MyNode<K> newNode) {
		MyNode<K> tempNode=targetNode.getNext();
		targetNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public void printLinkedList(MyNode<K> head)
	{
		MyNode<K> temp=head;
		while(temp.getNext()!=null)
		{
			System.out.print(temp.getKey()+"->");
			temp=temp.getNext();
		}
		System.out.print(temp.getKey()+"\n");
	}
	
	public MyNode<K> deleteFirstElement(MyNode<K> head)
	{
		MyNode<K> temp=head;
		setHead(head.getNext());
		return temp;
	}

	public MyNode<K> deleteLastElement(MyNode<K> head) {
		if(head==null)
			return null;
		MyNode<K> temp=head;
		while(temp.getNext().getNext()!=null)
		{
			temp=temp.getNext();
		}
		MyNode<K> lastElement=temp.getNext();
		setTail(temp);
		return lastElement;
	}
	
	public MyNode<K> searchElement(K target) {
		MyNode<K> temp=head;
		int check=0;
		while(temp.getNext()!=null)
		{
			if(temp.getKey().equals(target))
			{
				check=1;
				break;
			}
			temp=temp.getNext();
		}
		if(check==1)
			return temp;
		else
		{
			return null;
		}	
	}
	
	public void insertAfterSearchedElement(K target,K newNode) {
		MyNode<K> targetNode=searchElement(target);
		if(targetNode!=null)
		{
			insertNode(targetNode,new MyNode<K>(newNode));
		}
		else
		{
			System.out.println("Element could not be inserted!");
		}
	}
	
	public void deleteGivenElement(K target)
	{
		MyNode<K> toBeDeleted=searchElement(target);
		MyNode<K> tempNode=head;
		if(toBeDeleted!=null)
		{
			while (!tempNode.getNext().equals(toBeDeleted)) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(toBeDeleted.getNext());
			System.out.println("Element deleted");
		} else
			System.out.println("Element not deleted");
	}

	public int size(MyNode<K> head) {
		if(head==null)
			return 0;
		else
		{
			int count=1;
			MyNode<K> temp=head;
			while(temp.getNext()!=null)
			{
				count++;
				temp=temp.getNext();
			}
			return count;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void addOrdered(MyNode<K> newNode) {
		if (head == null || (((Comparable<K>) head.getKey()).compareTo((K) newNode.getKey()) >= 0)) {
			newNode.setNext((MyNode<K>) head);
			setHead((MyNode<K>) newNode);
		} else {
			MyNode<K> tempNode = head;
			while (tempNode.getNext() != null && (((Comparable<K>) tempNode.getNext().getKey()).compareTo((K) newNode.getKey())) < 0) {
				tempNode = tempNode.getNext();
			}
			if(tempNode.getNext() == null) {
				MyNode<K> myNode=searchElement(tempNode.getKey());
				myNode.setNext(newNode);
				setTail(newNode);
			}
			else {
				newNode.setNext(tempNode.getNext());
				MyNode<K> myNode=searchElement(tempNode.getKey());
				myNode.setNext(newNode);
			}				
		}
	}
}	
