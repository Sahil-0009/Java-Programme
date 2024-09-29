public class linkelList1 {
    private int size;

    linkelList1() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Initialize the head of the linked list
    private Node head;

    // addFirst method to add a node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head; // Point new node to current head
        head = newNode; // Update head to the new node
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Method to print the linked list
    public void printList2() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Sizeof the list
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        linkelList1 list = new linkelList1();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("Letter");
        // list.addLast("a");
        // list.addLast("is");
        // list.addLast("Letter");

        // Print the linked list
        list.printList();
        // list.printList2();
        // list.deleteFirst();
        // list.printList();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
