package stackandqueue;

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
}
