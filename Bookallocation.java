package extra;

public class Bookallocation {
    public static void main(String[] args) {

    }

    static int allocate(int[] arr,int n, int m){
        if(n<m){
            return -1;
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int start = 0;
        int end = sum;
        int ans =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(ispossible(arr,m,n,mid)){
                ans = mid;
                end =mid-1;
            }else start =mid+1;
        }
        return ans;
    }

    private static boolean ispossible(int[] arr, int m, int n, int mid) {
        int studentcount = 1;
        int noOfpages=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] + noOfpages <= mid) {
                noOfpages += arr[i];
            }
            else{
                studentcount++;
                if(studentcount>m ||arr[i]>mid){
                    return false;
                }
                noOfpages=arr[i];
        }
        }
        return true;
    }
}
