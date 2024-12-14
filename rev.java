package extra;

public class rev {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        reverse(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static void reverse(int[] arr){
        int f=0;
        int l = arr.length-1;

            while(f<=l) {
                int temp = arr[f];
                arr[f] = arr[l];
                arr[l] = temp;
                f++;
                l--;
            }
        }
    }

