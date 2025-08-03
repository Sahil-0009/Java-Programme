import java.util.HashMap;
import java.util.HashSet;

public class hashing {

    // This method finds all elements that appear more than n/3 times in the array
    // where n is the size of the array.
    // It uses a HashMap to count occurrences of each element.
    // The time complexity is O(n) and space complexity is O(n).

    /*
     * public static void majorityElement(int[] nums) {
     * HashMap<Integer, Integer> map = new HashMap();
     * int n = nums.length;
     * for (int i = 0; i < n; i++) {
     * if (map.containsKey(nums[i])) {
     * map.put(nums[i], map.get(nums[i]) + 1);
     * } else {
     * map.put(nums[i], 1);
     * }
     * }
     * for (int key : map.keySet()) {
     * if (map.get(key) > n / 3) {
     * System.out.print(key + " ");
     * }
     * }
     * }
     * 
     * public static void main(String[] args) {
     * int nums[] = { 1, 2, 3, 1, 5, 6, 1, 8, 1, 10 };
     * majorityElement(nums);
     * }
     */

    // This method finds the union of two arrays using a HashSet.
    // It adds all elements from both arrays to the set, which automatically handles
    // duplicates.
    // The size of the set at the end gives the count of unique elements.

    /*
     * public static int union(int[] arr1, int[] arr2) {
     * HashSet<Integer> set = new HashSet<>();
     * for (int num : arr1) {
     * set.add(num);
     * }
     * for (int num : arr2) {
     * set.add(num);
     * }
     * System.out.println("Elements in union: " + set);
     * return set.size();
     * }
     * public static void main(String[] args) {
     * int arr1[] = { 1, 2, 3, 1, 5, 6, 1, 8, 1, 10 };
     * int arr2[] = { 1, 2, 3, 1, 5, 6, 1, 8, 1, 10 };
     * System.out.println("Union of arr1 and arr2 is: " + union(arr1, arr2));
     * 
     * }
     */

    // This method finds the intersection of two arrays.
    // It uses a HashSet to store elements of the first array and then checks
    // for each element in the second array if it exists in the set.
    // It counts how many elements from the second array are present in the first
    // array, ensuring that duplicates in the second array are not counted multiple
    // times.

    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        int count = 0;
        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
                count++;
                set.remove(num); // To avoid counting duplicates in arr2
            }
        }
        System.out.println("Elements in intersection: " + intersectionSet);
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 1, 5, 6, 1, 8, 1, 10 };
        int arr2[] = { 1, 2, 3, 4, 5 };
        System.out.println("Intersection count of arr1 and arr2 is: " + intersection(arr1, arr2));
    }
}
