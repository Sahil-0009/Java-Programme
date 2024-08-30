public class SelectionSort {

    static void SelectionSort(int arr[], int n) {

        for (int i = 0; i <= n - 1; i++) {
            int max = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }
        System.out.println("After selection sort :");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SelectionSort(arr, n);

    }
}
