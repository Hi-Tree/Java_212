import java.util.StringTokenizer;

public class Project1{
    public static void main(String[] args){
        String paragraph = "";
        String[] wordArray;

        String fileName = args[0];
        
        TextFileInput in = new TextFileInput(fileName);//we input the text in main method just for simplicity 
        String line = in.readLine();
        while(line != null){
            paragraph += line + " ";
            line = in.readLine();
        }
        
        StringTokenizer st = new StringTokenizer(paragraph);
        wordArray = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens()){
            wordArray[i] = st.nextToken();
            i++;
        }

        String[] invalids = new String[wordArray.length];
        String[] valids = new String[wordArray.length];

        int j = separator(wordArray, invalids, valids);
        selectionSort(valids);
        
        WordGUI word = new WordGUI();
        word.printWords(wordArray, invalids, valids);
    }

        

/* ******************************************** Separator Method ***************************OK********************* */
    public static int separator(String[] array, String[] invalid, String[] valid){//here we separate the array into 2
        int invalidCount = 0;
        int validCount = 0;
        for(int i = 0; i < array.length; i++){//arrays are passed by reference 
            if(!array[i].matches("[a-zA-Z]+")){
                invalid[invalidCount] = array[i];
                invalidCount++;
            }
            else{
                valid[validCount] = array[i];
                validCount++;
            }
        }
        return validCount;
    }

/* ******************************************** Sort Method *****************************OK********************* */
public static void selectionSort(String[] array)
{
    int t = 0;//t will count how many filled so we dont encounter null
    while(array[t] != null){
        t++;
    }
  for ( int j=0; j < t-1; j++ ){
    int min = j;
    for ( int k=j+1; k < t; k++ )
      if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

    // Swap the reference at j with the reference at min 
    String temp = array[j];
    array[j] = array[min];
    array[min] = temp;
  }
}

}

