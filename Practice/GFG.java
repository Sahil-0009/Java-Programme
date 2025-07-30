// Class to represent a node in a doubly linked list
class Node {
    int data; // Value of the node
    Node prev; // Pointer to the previous node
    Node next; // Pointer to the next node

    // Constructor to initialize a node with a given value
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class GFG {

    // Function to delete the first node (head) of the list
    public static Node delHead(Node head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // Move the head to the next node
        head = head.next;

        // If the new head is not null, set its previous pointer to null
        if (head != null) {
            head.prev = null;
        }

        // Return the new head
        return head;
    }

    // Function to delete the last node of the list
    public static Node delLast(Node head) {
        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // If there's only one node, return null (list becomes empty)
        if (head.next == null) {
            return null;
        }

        // Traverse to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Adjust the previous node's next pointer to null (removing last node)
        if (curr.prev != null) {
            curr.prev.next = null;
        }

        // Return the head as the list is updated, but still starts at the same node
        return head;
    }

    // Function to delete a node at a specific position (1-based index)
    public static Node delPos(Node head, int pos) {
        // If the list is empty, return the head (null)
        if (head == null) {
            return head;
        }

        Node curr = head;

        // Traverse to the position (1-based index)
        for (int i = 1; curr != null && i < pos; i++) {
            curr = curr.next;
        }

        // If the position is invalid (out of bounds), return the original head
        if (curr == null) {
            return head;
        }

        // Adjust the previous and next pointers to "remove" the current node
        if (curr.prev != null) {
            curr.prev.next = curr.next; // Connect previous node to the next node
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev; // Connect next node to the previous node
        }

        // If we are deleting the head node, update the head to the next node
        if (head == curr) {
            head = curr.next;
        }

        // Return the head (which may have changed)
        return head;
    }

    // Function to print the list
    public static void printList(Node head) {
        Node curr = head;

        // Traverse the list and print each node's data
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println(); // Move to the next line after printing the list
    }

    // Main function to test the above methods
    public static void main(String[] args) {

        // Creating a doubly linked list with three nodes: 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2); // Second node (data = 2)
        head.next.prev = head; // Set prev of second node to first node
        head.next.next = new Node(3); // Third node (data = 3)
        head.next.next.prev = head.next; // Set prev of third node to second node

        // Print the original list
        System.out.print("Original Linked List: ");
        printList(head);

        // Delete the head node and print the list
        System.out.print("After Deletion at the beginning: ");
        head = delHead(head);
        printList(head);

        // Delete the last node and print the list
        System.out.print("After Deletion at the end: ");
        head = delLast(head);
        printList(head);

        // Delete the node at position 2 and print the list
        System.out.print("After Deletion at position 2: ");
        head = delPos(head, 2);
        printList(head);
    }
}
