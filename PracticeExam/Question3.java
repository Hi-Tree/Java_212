import javax.swing.JOptionPane;

public class Question3 {
    public static void main(String args[]){
        int digitCount = 0;
        String input = JOptionPane.showInputDialog(null, "Enter a String: ");
        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                digitCount++; 
            }
        }  
        JOptionPane.showMessageDialog(null, "There are " + digitCount + " digits.");
    } 
}

    

