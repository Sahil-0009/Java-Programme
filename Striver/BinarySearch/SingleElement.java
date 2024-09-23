package BinarySearch;

public class SingleElement {
    int solution(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1])
                    return arr[i];
            } else if (i == n - 1) {
                if (arr[i] != arr[i - 1])
                    return arr[i];
            } else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                    return arr[i];

            }
        }
        return n;
    }

    public static void main(String[] args) {
        SingleElement s = new SingleElement();
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, };
        int n = arr.length;
        System.out.println(s.solution(arr, n));
    }

}
