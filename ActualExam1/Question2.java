import javax.swing.*;
public class Question2 {
    public static void main(String[] args){
        int[][] myArray = {{1,21,1},{1,1,1},{1,1,1}};
        findNums(myArray);
         
    }

    public static int findNums(int[][] array){
        int twoDigitCounter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > 9 && array[i][j] < 100){
                    twoDigitCounter++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "The number of two digit numbers is " + twoDigitCounter);
        return twoDigitCounter; 
    }
}
