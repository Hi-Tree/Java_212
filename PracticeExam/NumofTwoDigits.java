import javax.swing.*;
public class NumofTwoDigits{
    public static void main(String[] args){
        String numbers = JOptionPane.showInputDialog(null, "Enter set of numbers: ");
        int twoDigitCounter = 0;
        for(int i = 0; i < numbers.length()-1; i++){
            if(Character.isDigit(numbers.charAt(i)) && Character.isDigit(numbers.charAt(i+1))){
                twoDigitCounter++;
            }
        }
        JOptionPane.showMessageDialog(null, "Two digits happened " + twoDigitCounter +" times.");
    }
}

