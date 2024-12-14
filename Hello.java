package extra;

public class Hello {
    public static void main(String[] args) {
        String str ="heLLo";
        System.out.println(toggle(str));
    }
    static String toggle(String str){
        char[] ch =str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
               str.toLowerCase();
            }else { ch[i] =(char)(str.charAt(i)-32);

            }
        }
        return str;

    }

}
