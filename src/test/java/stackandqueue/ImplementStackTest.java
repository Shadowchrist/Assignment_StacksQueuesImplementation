package stackandqueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImplementStackTest {

	@Test
	public void PushOperationOnStack() {
		MyNode firstNode = new MyNode(70);
		MyNode secondNode = new MyNode(30);
		MyNode thirdNode = new MyNode(56);

		ImplementStack stack = new ImplementStack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
	
	}

}
