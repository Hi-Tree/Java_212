public class Question1 {
    public static void main(String[] args){
        int endsWithDigit = 0;
        if(args.length < 2){
            throw new IllegalArgumentException("You must enter 2 arguments");
        }
        for(int i = 0; i < args.length; i++){
            if(Character.isDigit(args[i].charAt(args.length))){
               endsWithDigit++;
            }
        }
        System.out.println("There are "+endsWithDigit+" words that end with a digit.");
    }
}
