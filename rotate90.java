package extra;

public class rotate90 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(matrix);
        rotate(matrix);
        print(matrix);

    }
    static void transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void rotate(int[][] matrix){
        int low = 0;
        int high = matrix[0].length-1;
        while(low<high){
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][low];
                matrix[i][low]= matrix[i][high];
                matrix[i][high]=temp;

            }
            low++;
            high--;
        }
    }
    static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
