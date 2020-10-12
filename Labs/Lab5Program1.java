import TextFileInput.java;

public class Lab5Program1{
public static void main(String args[]){
    String isOrIsNot, inputWord;
			
    // This line asks the user for input by popping out a single window
    // with text input
    
    while(true){//this true has nothing to do with the true of the function it is simply infinite while loop
    inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
    if(inputWord.equals("STOP")){
        System.exit(0);
    }
    // if the inputWord is contained within wordArray return true
    if (wordIsThere(inputWord, wordArray)){ 
        isOrIsNot = "is"; // set to is if the word is on the list
    }
    else{
        isOrIsNot = "is not"; // set to is not if the word is not on the list
    }
    // Output to a JOptionPane window whether the word is on the list or not
    JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
}
} //main

inputFromFile(String fileName, String[] words){
    TextFileInput in = new TextFileInput(lab5input.txt);
    
}

public static boolean wordIsThere(String findMe, String[] theList) {
  boolean y = false;
  for(int i = 0; i < theList.length; i++){
    if(findMe.equals(theList[i])){
        y = true;
    }
  } 
return y;
} // wordIsTheree

}