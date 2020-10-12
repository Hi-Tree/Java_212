public class test {
    public static void main(String args[]){
        System.out.println(inputFromFile("lab5input.txt"));
    }


   private static String inputFromFile(String fileName){
        TextFileInput in = new TextFileInput(fileName);
        String line;
        String[] cat = new String[10];
        while(line = in.readLine() != String.empty()){
            line = in.readLine();
            cat[]
        }  
        
        if(line != null){
            System.exit(1);
        }
        in.close();
        return line;
    }
}
