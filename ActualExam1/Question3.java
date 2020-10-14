import javax.swing.*;
public class Question3 {
    public static void main(String[] args){
        String[] arr = new String[100];
        int k = 0;
        int odds = 0;
        while(true){
            String dial = JOptionPane.showInputDialog(null, "Enter One string at a time: ");
            if(dial.equals("STOP")){
                int i = 0;
                    while(arr[i] != null){
                    if(arr[i].length() % 2 != 0){
                        odds++;
                    }
                    i++;
                }
                JOptionPane.showMessageDialog(null, "Numbr of odd length words: " + odds);
                System.exit(0);
            }
        
            else{
                String[] split = dial.split(" ");
                if(split.length == 1){
                arr[k] = dial;
                k++;
                }
                else{
                    for(int h = 0; h < split.length; h++){
                        arr[k] = split[h];
                        k++;
                    }
                }
            }
        }
        }
    }

