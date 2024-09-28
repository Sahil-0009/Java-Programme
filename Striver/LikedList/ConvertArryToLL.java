class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ConvertArryToLL {

    // Method to convert array to linked list
    Node convertArryToLL(int[] arr) {
        if (arr.length == 0) {
            return null; // If the array is empty, return null
        }

        Node head = new Node(arr[0]); // Create the head node
        Node mover = head;

        // Traverse the array and create linked list nodes
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            mover.next = newNode;
            mover = mover.next;
        }

        return head;
    }

    // Method to print the linked list
    void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // For a new line after printing
    }

    // Method to calculate the length of the linked list
    int lengthOfLL(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to check if a value is present in the linked list
    int checkIfPresent(Node head, int val) {
        Node current = head;
        while (current != null) {
            if (current.data == val) {
                return 1; // Return 1 if the value is found
            }
            current = current.next;
        }
        return 0; // Return 0 if the value is not found
    }

    public static void main(String[] args) {
        ConvertArryToLL obj = new ConvertArryToLL();
        int[] arr = { 1, 2, 3, 4, 5 };

        // Convert array to linked list
        Node head = obj.convertArryToLL(arr);

        // Print the linked list
        obj.printLinkedList(head);

        // Calculate and print the length of the linked list
        int length = obj.lengthOfLL(head);
        System.out.println("Length of Linked List: " + length);

        // Check if a value is present in the linked list
        int value = 3;
        int isPresent = obj.checkIfPresent(head, value);
        System.out.println("Is " + value + " present? " + (isPresent == 1 ? "Yes" : "No"));
    }
}
