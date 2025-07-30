import java.util.LinkedList;
import java.util.Queue;

public class basicTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            if (curNode == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int currentDiameter = leftHeight + rightHeight + 1;

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    public static int minValue(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minValue(root.left), minValue(root.right)));
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return search(root.left, key) || search(root.right, key);
    }

    public static int countLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static int countNonLeafNodes(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Tree built successfully with root value: " + root.data);
        System.out.println("Preorder traversal of the tree:");
        preorder(root);
        System.out.println("\nInorder traversal of the tree:");
        inorder(root);
        System.out.println("\nPostorder traversal of the tree:");
        postorder(root);
        System.out.println("\nLevel order traversal of the tree:");
        levelOrder(root);
        System.out.println("\nTotal number of nodes in the tree: " + countNodes(root));
        System.out.println("Height of the tree: " + height(root));
        System.out.println("Diameter of the tree: " + diameter(root));
        System.out.println("Sum of all nodes in the tree: " + sumOfNodes(root));
        System.out.println("Maximum value in the tree: " + maxValue(root));
        System.out.println("Minimum value in the tree: " + minValue(root));
        System.out.println("Search for value 5 in the tree: " + search(root, 5));
        System.out.println("Count of leaf nodes in the tree: " + countLeafNodes(root));
        System.out.println("Count of non-leaf nodes in the tree: " + countNonLeafNodes(root));
    }
}