import javax.swing.*;
public class Project01{
    public static void main(String[] args){
            int n1 = 0;
            int n2 = 0;
            String sentence = JOptionPane.showInputDialog(null, "Please enter a sentense.");
            for(int i = 0; i < sentence.length(); i++){
                if(sentence.charAt(i) == 'E'){
                    n1++;
                }
                else if(sentence.charAt(i) == 'e'){
                    n2++;
                
            }
        }
        Two obj = new Two(n1,n2);
        System.out.println(obj.toString());
    }


}

