package linear_queue;
import java.util.Stack;

public class Queue {
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	//enqueue operation
	void enQueue(int x) {
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while (!s2.empty()) {
			s1.push(s2.pop());
		}
	}
	//dequeue operation
	int deQueue() {
		if (s1.empty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return s1.pop();
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
	}

}
