public class singlelinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void TraversalList(Node head) {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("null");

    }

    public boolean searchLinkedList(Node head, int target) {
        while (head != null) {
            if (head.data == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int SizeOfTheList(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

    }

    public Node insertAtFirst(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;

    }

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public Node insertAtPos(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid");
            return head;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node prev = head;
        int count = 1;
        while (count < pos - 1 && prev != null) {
            prev = prev.next;
            count++;
        }
        if (prev == null) {
            System.out.println("Invalid");
            return head;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;

    }

    Node removeFirstNode(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    Node removeLastNode(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            return null;
        }
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }
        second_last.next = null;
        return head;
    }

    public void deleteAtPosition(Node head, int position) {

        if (head == null || position < 1) {
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prevNode = null; // Start with previous node as null
        Node currentNode = head; // Current node starts at head

        while (currentNode != null) {
            Node nextNode = currentNode.next; // Store the next node
            currentNode.next = prevNode; // Reverse the pointer of current node
            prevNode = currentNode; // Move prevNode forward
            currentNode = nextNode; // Move currentNode forward
        }

        return prevNode; // Return new head (prevNode is the new head at the end)
    }

    public static void main(String[] args) {
        singlelinkedList list = new singlelinkedList();
        Node head = null;

        head = list.insertAtFirst(head, 1);
        head = list.insertAtFirst(head, 2);
        head = list.insertAtFirst(head, 3);

        head = list.insertAtEnd(head, 1);
        head = list.insertAtEnd(head, 2);
        head = list.insertAtEnd(head, 3);

        head = list.insertAtPos(head, 8, 2);
        head = list.insertAtPos(head, 9, 6);
        head = list.insertAtPos(head, 7, 4);

        head = list.removeFirstNode(head);
        head = list.removeLastNode(head);
        list.deleteAtPosition(head, 3);

        System.out.print("Linked List: ");
        singlelinkedList.TraversalList(head);

        int target = 3;
        boolean found = list.searchLinkedList(head, target);
        System.out.println("Element " + target + " found: " + found);

        int size = list.SizeOfTheList(head);
        System.out.println("Size of the linked list: " + size);

        // Reverse the linked list
        head = list.reverseList(head);
        System.out.print("Reversed Linked List: ");
        singlelinkedList.TraversalList(head);
    }

}
