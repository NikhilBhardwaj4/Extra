package extra;

import java.util.ArrayList;

public class phonenumber {
    public static void main(String[] args) {
        System.out.println(pad("","12"));
    }
    static ArrayList<String> pad(String p,String up){
        if(up.isEmpty()) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> li = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            li.addAll(pad(p+ch,up.substring(1)));
        }
        return li;
    }
}
