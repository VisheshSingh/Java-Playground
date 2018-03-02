
public class QueueDemo {

	int arr[] = new int[4];
	int top = -1, rear = 0;

	public void push(int pushElement) {
		if (top < 3) {
			top++;
			arr[top] = pushElement;
			System.out.println("Element " + pushElement + " is pushed");
			display();
		} else {
			System.out.println("overflow...");
		}
	}

	public void pop() {
		if (top >= rear) {
			rear++;
			System.out.println("Element popped out");
			display();
		} else {
			System.out.println("underflow...");
		}
	}

	public void display() {
		if (top >= rear) {
			System.out.println("Queue: ");
			for (int i = rear; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		QueueDemo que = new QueueDemo();
		que.push(10);
		que.push(20);
		que.push(30);
		que.push(40);
		que.pop();
		que.pop();
		que.pop();
	}

}
