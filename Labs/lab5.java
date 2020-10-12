import javax.swing.*;//star means import all under swing
public class lab5 {
    public static void main(String args[]){
        String[] wordArray = new String[20];//allocate array size 20
        String fileName = args[0];//only one argument 
        int actualLength = inputFromFile(fileName, wordArray);//function call
			
		// This line asks the user for input by popping out a single window
		// with text input
		
		while(true){//this true has nothing to do with the true of the bool function it is simply infinite while loop
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

	public static boolean wordIsThere(String findMe, String[] theList) {
	  boolean y = false;
	  for(int i = 0; i < theList.length; i++){
		if(findMe.equals(theList[i])){
			y = true;
		}
	  } 
	return y;
    } // wordIsTheree
    
    private static int inputFromFile(String filename, String[] numbers){//passed by reference array of strings 
        TextFileInput in = new TextFileInput(filename);
        int lengthFilled = 0;
        String line = in.readLine();//first line is read here 
        while(lengthFilled < numbers.length && line != null){//while there is space in array and txt is not over
            numbers[lengthFilled++] = line;//add to array 
            line = in.readLine();//remainder of txt file is read here 
        }
        if(line != null){
            System.out.println("File contains too many words.");
            System.out.println("This program can process only " + numbers.length + " numbers.");
            System.exit(1);
        }//if
    in.close();
    return lengthFilled;//function calculates both length and stores in array 
}//methdod 
    
}
