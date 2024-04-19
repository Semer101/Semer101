package linear_queue;

public class CircularQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	
	//constructor to initialize queue
	public CircularQueue(int size) {
		this.size = size;
		queue = new int[this.size];
		front = -1;
		rear = -1;
	}
	//method to check if queue is full
	public boolean isFull() {
		return (rear + 1) % size == front;
	}
	//method to check if queue is empty
	public boolean isEmpty() {
		return front == -1;
	}
	//method of add element
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue " + data);
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			queue[rear] = data;
			}
		}
	//method to remove element
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		} else {
			int data = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return data;
			}
		}
	//method to get front element of queue
	public int peak() {
		if (isEmpty()) {
			System.out.println("Queue is empty. No elements to peak.");
			return -1;
		} else {
			return queue[front];
		}
	}
	//method to display elements
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			System.out.print("Queue elements: ");
			for (int i = front; i != rear; i = (i + 1) % size) {
				System.out.print(queue[i] + " ");
		}
			System.out.println(queue[rear]);
	}
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.display();
		
		q.dequeue();
		q.dequeue();
		
		q.display();

	}

}
