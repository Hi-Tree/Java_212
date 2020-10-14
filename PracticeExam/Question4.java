//write the missing methode 
public class Question4 {
    public static void main(String[] args){
        int arr[][] = {{10,45},{2,42,67,5},{3,21}};
        System.out.println(getSumOfRow(arr, 1));
    }
    private static int getSumOfRow(int[][] array, int row){
        int sum = 0;
        for(int i = 0; i < array[row].length; i++){
            sum += array[row][i];
        }
        return sum;
    }
}
