public class doublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data1, Node next1, Node prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
        }
    }

    Node convertArr2DLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;

    }

    Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;

    }

    Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        current.prev = null;

        return head;

    }

    Node deleteKthEle(Node head, int k) {
        if (head == null || k <= 0) {
            return head; // Invalid case
        }

        Node current = head;
        int count = 1;

        // Traverse the list to find the k-th node
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // If k is greater than the length of the list
        if (current == null) {
            System.out.println("Position exceeds the length of the list.");
            return head;
        }

        // Case 1: If the node to be deleted is the head
        if (current.prev == null) {
            head = deleteHead(head);
            return head;
        }

        // Case 2: If the node to be deleted is the tail
        if (current.next == null) {
            head = deleteTail(head);
            return head;
        }

        // Case 3: Deleting an intermediate node
        Node prev = current.prev;
        Node next = current.next;

        prev.next = next;
        next.prev = prev;

        // Disconnect current node
        current.next = null;
        current.prev = null;

        return head;
    }

    void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = dll.convertArr2DLL(arr);
        // Node head1 = dll.deleteHead(head);
        // Node head2 = dll.deleteTail(head);
        Node head3 = dll.deleteKthEle(head, 1);
        // dll.print(head);
        dll.print(head3);

    }

}
