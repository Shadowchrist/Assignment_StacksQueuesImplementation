package stackandqueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImplementStackTest {

	@Test
	public void pushOperationOnStack() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		ImplementStack stack = new ImplementStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
	}
	
	@Test
	public void popAndPeekOperationsOnStack() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		ImplementStack stack = new ImplementStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		MyNode poppedNode= stack.peek();
		stack.pop();
		stack.printStack();
		assertEquals(thirdNode, poppedNode);
	}

	@Test
	public void checkIfStackIsEmpty() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		ImplementStack stack = new ImplementStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		assertTrue(stack.isEmpty());
	}
}
