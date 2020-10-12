import java.util.StringTokenizer;

public class Project10 {
    public static String[][] myArray;
    public static void main(String[] args){
        String[][] myArray = filledArray(args[0]);
        printArray(myArray);
    }

    private static void printArray(String[][] theArray){
        for(int i=0; i<theArray.length; i++){
            for(int j=0; j<theArray[i].length;j++){
                System.out.println(theArray[i][j]);
            }
        }
    }


    public static String[][] filledArray(String myFile){
        TextFileInput in = new TextFileInput(myFile);
        String line = in.readLine();
        StringTokenizer myTokens = new StringTokenizer(line, " ");
        int col = line.length();
        String[][] array = new String[4][col];

        for(int r=0; r<4;r++){
            line = in.readLine();
            myTokens = new StringTokenizer(line, " ");
            for(int c=0; c<col; c++){
                if(myTokens.nextToken() != null){
                array[r][c] = myTokens.nextToken();
                }
                else if(myTokens.nextToken() == null){
                    array[r][c] = null;
                }
            }
        }
        return array;
    }
}
