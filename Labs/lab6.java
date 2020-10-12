import javax.swing.*;//star means import all under swing
public class lab6 {
    public static void main(String args[]){
        int[] numArray = new int[20];//allocate array size 20
        String fileName = args[0];//only one argument 
        int actualLength = inputFromFile(fileName, numArray);//function call passed by reference is updated here!!!!!
        int summ = sum(numArray, actualLength);
        int avg = average(numArray,actualLength);
        JOptionPane.showMessageDialog(null, "Sum is:" + summ + " Average is: " + avg);
	} //main


    
    private static int inputFromFile(String filename, int[] numbers){//passed by reference array of strings 
        TextFileInput in = new TextFileInput(filename);
        int lengthFilled = 0;
        String line = in.readLine();//first line is read here 
        while(lengthFilled < numbers.length && line != null){//while there is space in array and txt is not over
            numbers[lengthFilled++] = Integer.parseInt(line);//add to array 
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


    public static int sum (int[] myArray, int myArraySize){
        int total = 0;
        for(int i = 0; i <= myArraySize; i++){
            total += myArray[i];
        }
        return total;
    }

    public static int average (int[] myArray, int myArraySize){
        int total = 0;
        for(int i = 0; i <= myArraySize; i++){
            total += myArray[i];
        }
        return total/myArraySize;
    }
}
