// =======Single Linklist========//
// class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
// public class day2 {
//     // public static class Node {
//     //     int data;
//     //     Node next;

//     //     public Node(int data) {
//     //         this.data = data;
//     //         this.next = null;
//     //     }
//     // }

//     public static void printList(Node n) {
//         while (n != null) {
//             System.out.print(n.data + " ");
//             n = n.next;
//         }
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         head.next = second;
//         second.next = third;
//         printList(head);
//     }
// }

// =========Double LinkedList=========//

// class Node {
//     int data;
//     Node next;
//     Node prev;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }
// }

// public class day2 {
//     static void forwardTraversal(Node head) {
//         Node curr = head;
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.next;
//         }
//     }

//     static void backwardTraversal(Node tail) {
//         Node curr = tail;
//         while (curr != null) {
//             System.out.print(curr.data + " ");
//             curr = curr.prev;
//         }
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);

//         head.next = second;
//         second.prev = head;
//         second.next = third;
//         third.prev = second;
//         third.next = fourth;
//         fourth.prev = third;
//         forwardTraversal(head);
//         System.out.println();
//         backwardTraversal(fourth);
//     }
// }
// // Output: 1 2 3 4
// //         4 3 2 1

// +++++++Circular Linked List++++++//

// class Node {
//     int data;
//     Node next;

//     Node(int value) {
//         data = value;
//         next = null;
//     }
// }

// class day2 {
//     static void printList(Node n) {
//         if (n == null) {
//             System.out.println("List is empty");
//         }
//         Node head = n.next;
//         while (head != null) {
//             System.out.print(head.data + " ");
//             head = head.next;
//             if (head == n.next)
//                 break;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node first = new Node(2);
//         first.next = new Node(3);
//         first.next.next = new Node(4);
//         Node last = first.next.next;
//         last.next = first;

//         printList(last);

//     }
// }

//+++++++++Doubly Circular linked list++++++//

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class day2 {

    static void forwardTraversal(Node head) {
        Node curr = head;
        if (head != null) {
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);
        }
        System.out.println();
    }

    static void backwardTraversal(Node head) {
        Node curr = head.prev;
        if (head != null) {
            do {
                System.out.print(curr.data + " ");
                curr = curr.prev;
            } while (curr.next != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a doubly circular linked list
        // 1 <-> 2 <-> 3 <-> 1
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = head;
        head.prev = third;

        System.out.println("Forward Traversal:");
        forwardTraversal(head);

        System.out.println("Backward Traversal:");
        backwardTraversal(head);
    }
}