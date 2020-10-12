/* Author:        Meri Khurshudyan
   Lab Section:   22B
   Summary:       Computes number of upper and lowercase E's in a sentence. 
*/

import javax.swing.*;

public class Project0{
    public static void main(String[] args){
        int numEs = 0;//upper case E
        int nume = 0;//Lower case e
        

        while(true){
          String input = JOptionPane.showInputDialog(null, "Please enter a sentense.");//take inputs while have not encountered STOP
          if(input.equals("STOP")){
              System.exit(0);
          }
          else{
          for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'E'){//char at compared to upper E
                numEs++;
            }
            else if(input.charAt(i) == 'e'){
                nume++;
            }
          }
          JOptionPane.showMessageDialog(null, "Number of lower e's:" + nume 
          + "\nNumber of upper E's:" + numEs);//break the line into two on dialog box
          numEs = 0;//reset the value of E's after calculations
          nume = 0;//same for e's
        }
        }
     
    }
}