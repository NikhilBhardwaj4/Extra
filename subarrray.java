package extra;

public class subarrray {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(subarray(arr));
    }

    static int subarray(int[] arr) {
        int csum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                csum = 0;
                for (int k = i; k <= j; k++) {
                    csum = csum + arr[k];
                }
                if (csum > max) {
                    max = csum;
                }
            }
        }
        return max;
    }
}

