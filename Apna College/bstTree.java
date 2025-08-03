public class bstTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (val < root.data) {
            return search(root.left, val);
        } else if (val > root.data) {
            return search(root.right, val);
        } else {
            return true; // value found
        }
    }
    public static void delete(Node root, int val) { 
        
    }

    public static void main(String[] args) {
        int[] values = { 15, 10, 20, 8, 12, 17, 25 };
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        System.out.println("Inorder traversal of the BST:");
        inorder(root);
        System.out.println();
        int searchValue = 12;
        if (search(root, searchValue)) {
            System.out.println("Value " + searchValue + " found in the BST.");
        } else {
            System.out.println("Value " + searchValue + " not found in the BST.");
        }
    }
}
