package linear_queue;

public class LinearQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int capacity;
	//constructor to initialize the queue
	public LinearQueue(int size) {
		capacity = size;
		queue = new int[capacity];
		front = -1;
		rear = -1;
	}
	//method to check queue is full
	public boolean isFull() {
		return rear == capacity -1;
		
	}
//method to check queue is empty
	public boolean isEmpty() {
		return front == -1 || front > rear;
		
	}
	//method to add element
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full.");
		} else {
			if (front == -1) {
				front = 0;
			}
			queue[++rear] = data;
		}
	}
	//method to remove element
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else { 
			int data = queue[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			return data;
			}
	}
	//method to display
	public void display() { 
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.print("Queue elements: ");
			for (int i = front; i <= rear; i++) { 
				System.out.print(queue[i] + " ");
			}
			System.out.println();
			}
		}
	
	public static void main(String[] args) {
		LinearQueue queue = new LinearQueue(5);
		//Enqueue elements
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		//Display elements
		queue.display();
		//Dequeue elements
		queue.dequeue();
		queue.dequeue();
		//Display elements
		queue.display();

	}

}
