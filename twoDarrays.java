package extra;

public class twoDarrays {
    public static void main(String[] args) {

    }
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;
            int i = 0;
            int j = m-1;

            while(j >= 0 && i < n){
                if(matrix[i][j] == target){
                    return true;
                }else if(matrix[i][j] < target){
                    i++;
                }else if(matrix[i][j] > target){
                    j--;
                }
            }

            return false;
        }
    }

