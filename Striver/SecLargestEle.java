public class SecLargestEle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                i++;
            } else {
                return;
            }
        }
        int Seclargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Seclargest && arr[i] != max) {
                Seclargest = arr[i];
            }
        }
        System.out.println("Second largest element is " + Seclargest);

    }
}
