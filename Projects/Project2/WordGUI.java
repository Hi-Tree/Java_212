import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;

public class WordGUI {
    private JFrame wordsGUI;
    private Container myContentPane;
    private TextArea myTextArea1;
    private TextArea myTextArea2;

    public WordGUI(){
        wordsGUI = new JFrame();
        wordsGUI.setTitle("Project1");
        wordsGUI.setBackground(Color.PINK); 
        wordsGUI.setLayout(new GridLayout(1,2));
        myContentPane = wordsGUI.getContentPane();
        myTextArea1 = new TextArea();
        myTextArea2 = new TextArea();
        myTextArea1.setForeground(Color.blue);
        myTextArea2.setForeground(Color.blue);
        Font font = new Font("Times", Font.BOLD, 20);
        myTextArea1.setFont(font);
        myTextArea2.setFont(font);
        myTextArea1.setBackground(Color.yellow);
        myTextArea2.setBackground(Color.yellow);
        myContentPane.add(myTextArea1);
        myContentPane.add(myTextArea2);

        wordsGUI.setSize(400,300);

        wordsGUI.setVisible(true);

        wordsGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display(WordList unsorted, WordList sorted){

        myTextArea1.append(unsorted.toString());

        myTextArea2.append(sorted.toString());


        
    }
}