package practice;

public class array {
    void insertAtBeginning(int[] arr, int ele) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = ele;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("Element inserted at beginning: " + ele);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void insertAtPosition(int[] arr, int pos, int ele) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid position");
            return;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = ele;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("Element inserted: " + ele);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    void insertAtEnd(int[] arr, int ele) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = ele;
        System.out.println("Element inserted at end: " + ele);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void deleteAtFirst(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        System.out.println("Element deleted at first");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void deleteAtPosition(int[] arr, int pos) {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        System.out.println("Element deleted at position: " + pos);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void deleteAtEnd(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("Element deleted at end");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        array a = new array();
        // a.insertAtPosition(arr, 2, 25);
        // a.insertAtEnd(arr, 60);
        // a.insertAtBeginning(arr, 5);
        a.deleteAtFirst(arr);
        a.deleteAtPosition(arr, 2);
        a.deleteAtEnd(arr);

    }
}
