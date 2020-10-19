package stackandqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImplementQueueTest {

	@Test
	public void EnqueueOperationOnQueue() {
		MyNode firstNode = new MyNode(56);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(70);

		ImplementQueue queue = new ImplementQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
	}
	
	@Test
	public void DequeueOperationOnQueue() {
		MyNode firstNode = new MyNode(56);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(70);

		ImplementQueue queue = new ImplementQueue();
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
		MyNode dequeuedNode=queue.top();
		queue.dequeue();
		queue.printQueue();
		assertEquals(firstNode, dequeuedNode);
	}
}
