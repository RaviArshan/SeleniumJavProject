package interview;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 10, 18, 29, 90};
        int key = 4;
        System.out.println("Key found at index: " + binarySearch(arr, key));
    }

    public static int binarySearch(int[] arr, int key) {
        int l = 0, h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;   // or better: l + (h - l) / 2 (avoids overflow in big arrays)
            System.out.println(mid);
            if (arr[mid] == key) {
                return arr[mid];  // key found
            } else if (key < arr[mid]) {
                h = mid - 1; // search left half
            } else {
                l = mid + 1; // search right half
            }
        }
        return -1; // not found
    }
}
