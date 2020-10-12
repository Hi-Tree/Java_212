import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;

public class WordGUI {
    private JFrame wordsGUI;
    private Container myContentPane;
    private TextArea myTextArea1;
    private TextArea myTextArea2;
    private TextArea myTextArea3; 

    public WordGUI(){
        wordsGUI = new JFrame();
        wordsGUI.setTitle("Project1");
        wordsGUI.setBackground(Color.PINK); 
        wordsGUI.setLayout(new GridLayout(1,3));
        myContentPane = wordsGUI.getContentPane();
        myTextArea1 = new TextArea();
        myTextArea3 = new TextArea();
        myTextArea2 = new TextArea();
        myTextArea1.setBackground(Color.PINK);
        myTextArea2.setBackground(Color.PINK);
        myTextArea3.setBackground(Color.PINK);
        myContentPane.add(myTextArea1);
        myContentPane.add(myTextArea3);
        myContentPane.add(myTextArea2);
        wordsGUI.setSize(800,600);

        wordsGUI.setVisible(true);

        wordsGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void printWords(String[] list, String[] invalids, String[] valids){

        
        StringBuilder sb = new StringBuilder();
        for(String str : list) {
            if(str != null){
                sb.append(str);
                sb.append("\n");
            }
        }

        myTextArea1.append(sb.toString());

        StringBuilder sb1 = new StringBuilder();
        for(String str : invalids) {
            if(str != null){
                sb1.append(str);
                sb1.append("\n");
            }
        }

        myTextArea2.append(sb1.toString());

        StringBuilder sb3 = new StringBuilder();
        for(String str : valids) {
            if(str != null){
                sb3.append(str);
                sb3.append("\n");
            }
        }

        myTextArea3.append(sb3.toString());
        
    }
}
