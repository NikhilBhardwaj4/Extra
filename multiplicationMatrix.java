package extra;

public class multiplicationMatrix {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        multiply(a,b);
    }
    static void multiply(int[][] first , int[][] second){
        int[][] res = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    res[i][j]=res[i][j]+first[i][k]*second[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j]+" ");

            }
            System.out.println();
        }
    }
}
