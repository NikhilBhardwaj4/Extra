package extra;

public class power {
    public static void main(String[] args) {
        int n =2;
        int p=2;
        System.out.println(power(n,p));
    }
    static int power(int n,int p){
        if(p==0){
            return 1;
        }
        else{
            return  n*power(n,p-1);
        }
    }
}
