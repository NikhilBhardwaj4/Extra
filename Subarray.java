package extra;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        printPairs(arr, n);
    }
    static void printPairs ( int arr[], int n)
    {

        // Nested loop for all possible pairs
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print("(" + arr[i] + ", "
                        + arr[j] + ")");
            }
        }
    }
}
