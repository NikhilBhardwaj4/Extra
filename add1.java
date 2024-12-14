package extra;
import java.util.*;

public class add1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        System.out.println(inc(num));
    }
    static int inc(int num){
        int add =1;
        for (int i = 0; i <String.valueOf(num).length(); i++) {
            num =num+add;
            add = add*10;
        }
        return num;
    }
}
