public class doubleList {
    Node head = new Node(0);
    Node tail = new Node(0);

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class GFG {
        // Traversal in forward direction
        static void traversalForward(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " <-> ");
                curr = curr.next;
            }
            System.out.println("null"); // End of the list
        }

        // Traversal in backward direction
        static void traversalBackward(Node tail) {
            Node curr = tail;
            while (curr != null) {
                System.out.print(curr.data + " <-> ");
                curr = curr.prev;
            }
            System.out.println("null"); // Start of the list
        }

        static int Listlength(Node head) {
            int count = 0;
            for (Node cur = head; cur != null; cur = cur.next) {
                count++;
            }
            return count;
        }

        static Node insertBegin(doubleList dll, Node head, int data) {
            Node newNode = dll.new Node(data);
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            return newNode;
        }

        static Node insertAtEnd(doubleList dll, Node head, int data) {
            Node newNode = dll.new Node(data);
            if (head == null) {
                return newNode;
            } else {
                Node curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = newNode;
                newNode.prev = curr;
            }
            return head;
        }

        public static Node insertAtPosition(doubleList dll, Node head, int pos, int data) {
            // Create a new node
            Node new_node = dll.new Node(data);

            // Insertion at the beginning
            if (pos == 1) {
                new_node.next = head;

                if (head != null) {
                    head.prev = new_node;
                }

                head = new_node;
                return head;
            }

            Node curr = head;
            for (int i = 1; i < pos - 1 && curr != null; ++i) {
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Position is out of bounds.");
                return head;
            }

            new_node.prev = curr;

            new_node.next = curr.next;

            curr.next = new_node;

            if (new_node.next != null) {
                new_node.next.prev = new_node;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        doubleList dll = new doubleList();

        // Creating nodes
        Node head = dll.new Node(1);
        Node second = dll.new Node(2);
        Node third = dll.new Node(3);

        // Linking nodes
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        // Forward traversal
        System.out.print("Forward Traversal: ");
        GFG.traversalForward(head);

        // Backward traversal (from the last node 'third')
        System.out.print("Backward Traversal: ");
        GFG.traversalBackward(third);

        System.out.print("Current length: " + GFG.Listlength(head));

        // Insert at beginning
        head = GFG.insertBegin(dll, head, 0);
        System.out.print("\nAfter inserting at the beginning: ");
        GFG.traversalForward(head);

        // Insert at the end
        head = GFG.insertAtEnd(dll, head, 4);
        System.out.print("After inserting at the end: ");
        GFG.traversalForward(head);

        // Insert at position 3
        head = GFG.insertAtPosition(dll, head, 3, 5);
        System.out.print("After inserting at position 3: ");
        GFG.traversalForward(head);
    }
}
