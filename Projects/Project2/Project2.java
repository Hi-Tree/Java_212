import java.util.StringTokenizer;
public class Project2 {
    public static void main(String[] main){
        String paragraph = "";
        TextFileInput tf = new TextFileInput("Input.txt");
        SortedWordList swl = new SortedWordList();
        UnsortedWordList uwl = new UnsortedWordList();
        String line = tf.readLine();
        while(line != null){
            paragraph += line + " ";
            line = tf.readLine();
        }

        StringTokenizer st = new StringTokenizer(paragraph);
        
        while(st.hasMoreTokens()){
            
            String word = st.nextToken();
            Word w = new Word(word);
            swl.add(w);
            uwl.add(w);

        }

        WordGUI gui = new WordGUI();
        gui.display(uwl,swl);
    }    
}
