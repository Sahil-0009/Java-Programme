<<<<<<< HEAD
public class arrayIsSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean isSorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }

        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }

}
=======
public class arrayIsSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean isSorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }

        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }

}
>>>>>>> 6af294f36f07cebedcb402680b53872868b590eb
