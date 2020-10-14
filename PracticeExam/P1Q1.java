public class P1Q1{

    public static void main(String[] args) throws Exception{
        if(args.length < 2){
            throw new Exception("You must enter 2 arguments");
        }

        System.out.println("Product of args: " + Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
        System.out.println("Sum of args: " + Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

    }

}