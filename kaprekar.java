package extra;

public class kaprekar {
    public static void main(String[] args) {
        int n= 45;
        kap(n);
    }
    static void kap(int num){
        int sq,fp,sp,sum;
        sq= num*num;
        int temp = num;
        int count =0;
        while( temp>0){
            count ++;
            temp =temp/10;
        }
        int p = (int)Math.pow(10,count);
        fp = sq/p;
        sp=sq%p;
        sum=fp+sp;
        if(sum==num){
            System.out.println("kaprekar");
        }else System.out.println("Not Kaprekar");
    }
}
