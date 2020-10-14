//is sum of diagonal equal to sum of a row?
public class RowequalsFL {
    public static void main(String[] args){
        int[][] myArray = {{1,1,1},{1,1,1}};
        System.out.println(equate(myArray,1));
    }

    public static boolean equate(int[][] arr, int row){
        if(arr.length != arr[1].length){
            throw new IllegalArgumentException("Not a square array.");
        }
        boolean y = false;
        int sumDiag = 0;
        int sumRow = 0;
        for(int i = 0; i < arr.length; i++){
            int j = i;
            sumDiag += arr[i][j];
        }
        for(int k = 0; k<arr.length; k++){
            sumRow += arr[row][k];
        }
        if(sumDiag == sumRow){
            y = true;
        }
        return y;
    }
    
}
