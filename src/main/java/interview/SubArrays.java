package interview;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        subArray(arr);
    }

    public static void subArray(int[] arr) {
        int n = arr.length;

        // Start index
        for (int i = 0; i < n; i++) {
            // End index
            for (int j = i; j < n; j++) {
                // Print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Move to next line for next subarray
            }
        }
    }
}
