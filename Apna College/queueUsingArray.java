public class queueUsingArray {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;

        // Constructor to initialize the queue with a given size
        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue
        public void add(int data) {
            if (rear == size - 1) { // If the queue is full
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove an element from the queue (FIFO)
        public int remove() {
            if (isEmpty()) { // If the queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0]; // Get the front element
            // Shift all elements to the left
            for (int i = 1; i <= rear; i++) {
                arr[i - 1] = arr[i];
            }
            rear--; // Reduce the size of the queue
            return front;
        }

        // Peek at the front element of the queue
        public int peek() {
            if (isEmpty()) { // If the queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0]; // Return the front element
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3); // Initialize the queue with size 3
        q.add(1); // Add elements to the queue
        q.add(2);
        q.add(3);

        // Try to add an element when the queue is full
        q.add(4); // This will display "Queue is full"

        // Remove and print elements from the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print the front element
            q.remove(); // Remove the front element
        }
    }
}
