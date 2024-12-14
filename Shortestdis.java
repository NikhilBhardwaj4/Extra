package extra;

public class Shortestdis {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestdis(str));
    }
    static float shortestdis(String s){
        int x = 0 ;
        int y =0 ;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'S') y--;
            if(ch == 'N') y++;
            if(ch == 'E') x++;
            if(ch == 'W') x--;
        }
        int x2 =x*x;
        int y2 = y*y;
        int sna=x2+y2;
        return (float)Math.sqrt(sna);
    }

}
