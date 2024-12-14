package extra;

public class stringpalindrome {
    public static void main(String[] args) {
        String str = "moon";
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str){
        String rev ="";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
}
